package com.lightcodese.dsa.repository;

import com.lightcodese.dsa.entity.user.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@RepositoryDefinition(domainClass = UserEntity.class, idClass = Long.class)
public interface UserRepository extends JpaRepository<UserEntity, Long> , JpaSpecificationExecutor<UserEntity> {
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    UserEntity findByUserName(String username);

//    LIKE %?
    List<UserEntity> findByUserNameStartingWith(String userEmail);
//    LIKE ?%
    List<UserEntity> findByUserNameEndingWith(String userEmail);

//    WHERE id < ...
    List<UserEntity> findByIdLessThan(Long id);

//    raw : JPQL
    @Query("SELECT u FROM UserEntity u WHERE u.id = (SELECT MAX(u.id) FROM UserEntity p)")
    UserEntity findMaxIdUser();

    @Query("SELECT u FROM UserEntity u WHERE u.id = ?1 AND u.userEmail = ?2")
    List<UserEntity> getUserEntitiesBy(String username, String email);

    @Query("SELECT u FROM UserEntity u WHERE u.id = :username AND u.userEmail = :email")
    List<UserEntity> getUserEntitiesByParam(@Param("username") String username,@Param("email") String email);

//    UPDATE
    @Modifying
    @Query("UPDATE UserEntity u SET u.userName = :username")
    @Transactional
    int updateUserName(@Param("username") String username);

//    NATIVE QUERY
//    GET COUNT USER USE NATIVE QUERY
    @Query(value = "SELECT COUNT(id) FROM java_user_001", nativeQuery = true)
    long getTotalUsers();
}
