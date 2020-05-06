package test;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import codingfactory.rpgconsole.hero.Hero;

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
		System.out.println("succes");
	}

	@Test
	public void testTakeDamage() throws Exception {
		hero = new Hero("Martin");
		hero.takeDamage(5);
		assertThat(hero,hasProperty(hp),is(15));
	}

	@Test
	public void testAttack() throws Exception {
		Enemy skt = new Enemy("Peter",1);
		value=skt.getHp();
		hero = new Hero("Martin");
		hero.attack(skt);
		assertGreater(value,skt.getHp());
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
