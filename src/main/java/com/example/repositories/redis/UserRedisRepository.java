package com.example.repositories.redis;

import com.example.entities.UserRedis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("userRedisRepository")
public interface UserRedisRepository extends CrudRepository<UserRedis, Long> {
}
