package top.ximimi.springdemo.sftp;

import com.jcraft.jsch.ChannelSftp;
import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.DestroyMode;
import org.apache.commons.pool2.PooledObject;


public class SftpFactory extends BasePooledObjectFactory<ChannelSftp> {
    @Override
    public ChannelSftp create() {
        return null;
    }

    @Override
    public PooledObject<ChannelSftp> wrap(ChannelSftp channelSftp) {
        return null;
    }

    @Override
    public void destroyObject(PooledObject<ChannelSftp> p, DestroyMode destroyMode) throws Exception {
        super.destroyObject(p, destroyMode);
    }

    @Override
    public void activateObject(PooledObject<ChannelSftp> p) throws Exception {
        super.activateObject(p);
    }

    @Override
    public void destroyObject(PooledObject<ChannelSftp> p) throws Exception {
        super.destroyObject(p);
    }

    @Override
    public PooledObject<ChannelSftp> makeObject() throws Exception {
        return super.makeObject();
    }

    @Override
    public void passivateObject(PooledObject<ChannelSftp> p) throws Exception {
        super.passivateObject(p);
    }

    @Override
    public boolean validateObject(PooledObject<ChannelSftp> p) {
        return super.validateObject(p);
    }
}
