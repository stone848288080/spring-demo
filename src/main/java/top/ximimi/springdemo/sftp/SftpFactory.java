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
}
