package test;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import static org.hamcrest.Matchers.*;

import codingfactory.rpgconsole.hero.Hero;
import codingfactory.rpgconsole.enemy.Enemy;

public class EnemyTest {

	Enemy e;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Avant le démarrage Enemy");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Après tous les tests Enemy");
	}

	@Before
	public void setUp() throws Exception {
		e = new Enemy("J",1);
		System.out.println("Avant un test Enemy");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Après un test Enemy");
	}


	@Test
	public void testAttack() throws Exception {
		Hero hero2 = new Hero("Martin");
		Enemy e = new Enemy("skt",1);
		System.out.println("enemy hp before :"+hero2.getHp());
		e.attack(hero2);
		assertThat(20, greaterThan(hero2.getHp()));
		System.out.println("enemy hp after :"+hero2.getHp());
	}


	@Test
	public void testTakeDamage() throws Exception {
		Enemy e = new Enemy("Martin",1);
		System.out.println("Après un test domage : "+e.getHp());
		e.takeDamage(5);
		System.out.println("Après un test domage : "+e.getHp());
		assertThat(e.getHp(),is(10));
	}

	@Test
	public void testHeroProperties() throws Exception {
		e = new Enemy("J",1);
		assertThat(e, hasProperty("name"));
        assertThat(e, hasProperty("name", is("J")));
        assertThat(e, hasProperty("level"));
        assertThat(e, hasProperty("level", is(1*e.getLevel())));
        assertThat(e, hasProperty("hp"));
        assertThat(e, hasProperty("hp", is(15)));
        assertThat(e, hasProperty("atk"));
        assertThat(e, hasProperty("atk", is(1)));
	}

}
