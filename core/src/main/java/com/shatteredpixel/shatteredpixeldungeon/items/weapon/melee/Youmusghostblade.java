/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2022 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.actors.Char;
import com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Buff;
import com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Wraithstep;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.Hero;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;

import java.util.ArrayList;

public class Youmusghostblade extends MeleeWeapon {
	public static final String AC_ZAP = "ZAP";
	
	{
		image = ItemSpriteSheet.YOUMUS_GHOSTBLADE;
		hitSound = Assets.Sounds.HIT_SLASH;
		hitSoundPitch = 1f;
		defaultAction = AC_ZAP;
		tier = 4;
	}

	@Override
	public ArrayList<String> actions(Hero hero) {
		ArrayList<String> actions = super.actions(hero);
		actions.add(AC_ZAP);
		return actions;
	}
/*
	public int proc(Char attacker, Char defender, int damage) {

		Buff.affect(defender, Wraithstep.class, 5f);

		updateQuickslot();

		return super.proc(attacker, defender, damage);
	}
*/
	@Override
	public int max(int lvl) {
		return  4*(tier+1) - 1 +    //24 base, down from 25
				lvl*(tier+1) - 1;   //scaling unchanged
	}


}
