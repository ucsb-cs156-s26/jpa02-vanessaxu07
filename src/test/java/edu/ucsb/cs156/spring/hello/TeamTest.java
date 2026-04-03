package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
   @Test
    public void equal_returns_correct_obj() {
       assertEquals(true, team.equals(team));
    }
    @Test
    public void equal_returns_correct_instanceof() {
       assertEquals(false, team.equals("team"));
    }
    @Test
    public void equal_returns_correct_values() {
       Team other = new Team ("test-team");
       assertEquals(true, team.equals(other));
    }
    @Test
    public void equal_returns_different_values() {
       Team other = new Team ("different-team");
       assertEquals(false, team.equals(other));
    }
    @Test
    public void returns_correct_toString_test() {
       assertEquals("Team(name=" + "test-team" + ", members=" + "[]" + ")", team.toString());
    }
    @Test
    public void returns_correct_hashcode() {
       int expected = team.getName().hashCode() | team.getMembers().hashCode();
       assertEquals(expected, team.hashCode());
    }
}
