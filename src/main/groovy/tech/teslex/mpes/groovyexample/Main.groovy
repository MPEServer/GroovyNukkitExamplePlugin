package tech.teslex.mpes.groovyexample

import cn.nukkit.plugin.PluginBase

import groovy.transform.CompileStatic

@CompileStatic
class Main extends PluginBase {

	@Override
	void onEnable() {
		logger.info("Yeee! I'm working!!")
	}

}
