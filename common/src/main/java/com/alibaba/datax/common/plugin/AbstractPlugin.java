package com.alibaba.datax.common.plugin;

import com.alibaba.datax.common.base.BaseObject;
import com.alibaba.datax.common.util.Configuration;

public abstract class AbstractPlugin extends BaseObject implements Pluginable {
	private Configuration pluginJobConf;

	private Configuration pluginConf;


    private Configuration readerConf;

    private Configuration writerConf;

    @Override
	public String getName() {
		assert null != this.pluginConf;
		return this.pluginConf.getString("name");
	}

    @Override
	public String getDeveloper() {
		assert null != this.pluginConf;
		return this.pluginConf.getString("developer");
	}

    @Override
	public String getDescription() {
		assert null != this.pluginConf;
		return this.pluginConf.getString("description");
	}

    @Override
	public Configuration getPluginJobConf() {
		return pluginJobConf;
	}

    @Override
	public void setPluginJobConf(Configuration pluginJobConf) {
		this.pluginJobConf = pluginJobConf;
	}

    @Override
	public void setPluginConf(Configuration pluginConf) {
		this.pluginConf = pluginConf;
	}

    @Override
    public Configuration getReaderConf() {
        return readerConf;
    }

    @Override
    public void setReaderConf(Configuration readerConf) {
        this.readerConf = readerConf;
    }

    @Override
    public Configuration getWriterConf() {
        return writerConf;
    }

    @Override
    public void setWriterConf(Configuration writerConf) {
        this.writerConf = writerConf;
    }

	public void prepare() {
	}

	public void post() {
	}
}
