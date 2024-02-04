package com.example.digitallibrary.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class CacheConfig {
    //creating a connection to the redis server
    @Bean
    public LettuceConnectionFactory getConnectionFactory(){//lettuce is a driver for redis
        //for cloud redis
//        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration("redis-12236.c322.us-east-1-2.ec2.cloud.redislabs.com", 12236);
//
//        configuration.setPassword("PIYZiRl1ZqVOfYQSeF9ZEiHRN10GIHkY");
//
//        LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory(configuration);

//        for local machine
        LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory(
                new RedisStandaloneConfiguration("localhost",6379)//running on localhost or on a machine
        );

        return lettuceConnectionFactory;
    }


    @Bean
    public RedisTemplate<String, Object> getTemplate(){//key type is always be string, and value type is object - if we make it person then what if later we need to store admin details
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>() ;
        //this template needs a con fac to work
        redisTemplate.setConnectionFactory(getConnectionFactory());//using above fn to set con, also we can do in a same fn(this)

        //serialization - converting from one data type to another
        //now we need to serialize the java object to redis string
        //serialize fns - convert to byte array and send to redis server
        //deserialize fns - convert to string and send to app server

        redisTemplate.setKeySerializer(new StringRedisSerializer());//for keys - this is taking a string
        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());//for values - this is taking an object
        redisTemplate.setHashKeySerializer(new JdkSerializationRedisSerializer());
        redisTemplate.setKeySerializer(new JdkSerializationRedisSerializer());

        return redisTemplate;

    }
}
