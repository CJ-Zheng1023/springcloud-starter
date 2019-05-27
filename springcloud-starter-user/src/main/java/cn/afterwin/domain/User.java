package cn.afterwin.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @description:
 * @author: zhengchj
 * @create: 2019-05-09 15:36
 **/
@Entity
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    @Column
    private String username;
    @Column
    private int age;
    @OneToOne
    @JoinColumn(name = "info_id", referencedColumnName = "id")
    private UserInfo userInfo;
}
