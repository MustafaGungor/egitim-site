package com.mebitech.samples.quickstart.dao.mail;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.mail.SendMail;
import org.springframework.stereotype.Service;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 15/06/2017
 * @see SendMailDao
 */
@Service
public class SendMailDao extends BaseDaoImpl<SendMail, String> {
}
