package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
// Entity를 보고 테이블을 생성
public class Member {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
}
