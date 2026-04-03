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
    public void equal_returns_correct_value() {
       Team other = new Team ("test-team");
       assertEquals(true, team.equals(other));
    }
    @Test
    public void equal_returns_different_values() {
       Team other = new Team ("different-team");
       assertEquals(false, team.equals(other));
    }
    @Test
    public void equal_returns_different_object() {
       assertEquals(false, team.equals("team"));
    }
    @Test
    public void equal_returns_different_members() {
       Team other = new Team("test-team");
       other.addMember("Alley");
       assertEquals(false, team.equals(other));
    }
    @Test
    public void equal_returns_same_object() {
       assertEquals(true, team.equals(team));
    }
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    @Test
    public void returns_correct_hashcode() {
       Team t1 = new Team();
       t1.setName("foo");
       t1.addMember("bar");
       Team t2 = new Team();
       t2.setName("foo");
       t2.addMember("bar");
       assertEquals(t1.hashCode(), t2.hashCode());
    }
    @Test
    public void returns_anothercorrect_hashcode() {
       Team t = new Team();
       int result = t.hashCode();
       int expectedResult = 1;
       assertEquals(expectedResult, result);
    }
}
