package com.robdragon234.clantags.impl.factions;

import com.robdragon234.clantags.impl.members.Member;

import java.util.List;

public class AdvancedFaction extends Faction
{
	public AdvancedFaction(
		String id,
		String name,
		String tag,
		String desc,
		String discord,
		String wiki,
		List<Member> members
	)
	{
		super(id, name, tag, desc, discord, wiki, members);
	}
}