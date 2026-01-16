package com.imt.mines;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersonTest {
    private static Person person;
    @BeforeAll
    static void setUp() throws Exception {
        person = new Person("Lenny", 'M', 22, 52.0f, 1.72f, "brown", "black", "lenny@gmail.com");
    }

    @Test
    void setHaircolor_happyPath_haircolorChanges_blond() {
        person.setHairColor("blond");
        assertEquals("blond", person.getHairColor());
    }

    @Test
    void setHaircolor_happyPath_haircolorChanges_brown() throws Exception {
        Person personBlondHair = new Person("Lenny", 'M', 22, 52.0f, 1.72f, "blond", "black", "lenny@gmail.com");
        personBlondHair.setHairColor("brown");
        assertEquals("brown", personBlondHair.getHairColor());
    }

    @Test
    void setHaircolor_happyPath_haircolorChanges_black() {
        person.setHairColor("black");
        assertEquals("black", person.getHairColor());
    }

    @Test
    void setHaircolor_happyPath_haircolorChanges_white() {
        person.setHairColor("white");
        assertEquals("white", person.getHairColor());
    }

    @Test
    void setHaircolor_edgeCase_emptyString_haircolorUnchanged() {
        String initialHaircolor = person.getHairColor();
        person.setHairColor("");
        assertEquals(initialHaircolor, person.getHairColor());
    }
}