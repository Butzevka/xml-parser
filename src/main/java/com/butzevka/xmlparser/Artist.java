package com.butzevka.xmlparser;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = {"id"})
public class Artist {
    private int id;
    @JacksonXmlProperty(localName = "firstname")
    private String firstName;
    @JacksonXmlProperty(localName = "lastname")
    private String lastName;
    private String pseudonym;
    private String profession;
    private boolean alive;
}
