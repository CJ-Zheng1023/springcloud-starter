package cn.afterwin.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @description:
 * @author: zhengchj
 * @create: 2019-05-24 10:51
 **/
@Entity
@Data
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String address;
    @Column
    private String country;
}
