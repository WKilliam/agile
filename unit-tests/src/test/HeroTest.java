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

public class HeroTest {

	Hero hero;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Avant le démarrage");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Après tous les tests");
	}

	@Before
	public void setUp() throws Exception {
		hero = new Hero("Jaina Portvaillant");
		System.out.println("Avant un test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Après un test");
	}

	@Test
	public void testHeroLevelUp() throws Exception {
		Hero hero = new Hero("Jaina Portvaillant");
		hero.levelUp();
		assertThat(hero, hasProperty("level", is(2)));
	}

	@Test
	public void testAttack() throws Exception {
		Hero hero2 = new Hero("Martin");
		Enemy e = new Enemy("skt",1);
		System.out.println("enemy hp before :"+e.getHp());
		hero2.attack(e);
		assertThat(15, greaterThan(e.getHp()));
		System.out.println("enemy hp after :"+e.getHp());
	}


	@Test
	public void testTakeDamage() throws Exception {
		Hero hero1 = new Hero("Martin");
		hero1.takeDamage(5);
		System.out.println("Après un test domage : "+hero1.getHp());
		assertThat(hero1.getHp(),is(15));
	}

	@Test
	public void testHeroProperties() throws Exception {
		Hero hero = new Hero("Jaina Portvaillant");
		assertThat(hero, hasProperty("name"));
        assertThat(hero, hasProperty("name", is("Jaina Portvaillant")));
        assertThat(hero, hasProperty("level"));
        assertThat(hero, hasProperty("level", is(1)));
        assertThat(hero, hasProperty("hp"));
        assertThat(hero, hasProperty("hp", is(20)));
        assertThat(hero, hasProperty("atk"));
        assertThat(hero, hasProperty("atk", is(2)));
	}

}
