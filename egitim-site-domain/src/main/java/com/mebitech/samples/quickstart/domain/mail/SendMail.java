package com.mebitech.samples.quickstart.domain.mail;


import com.mebitech.robe.persistence.jpa.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Mail Entity
 *
 * @author MustafaGungor
 * @version 1.0.0
 * @since 15/06/2017
 * @see SendMail
 */
@Entity
@Table(name = "Mail")
public class SendMail extends BaseEntity{

    private String sendName;
    private String mailTitle;
    private String mail;


    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getMailTitle() {
        return mailTitle;
    }

    public void setMailTitle(String mailTitle) {
        this.mailTitle = mailTitle;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
