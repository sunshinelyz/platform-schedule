package com.courage.platform.schedule.server.rpc.processor;

import com.courage.platform.rpc.remoting.netty.codec.PlatformNettyRequestProcessor;
import com.courage.platform.rpc.remoting.netty.protocol.PlatformRemotingCommand;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
   回调任务处理结果处理器
 */
public class CallbackScheduleResultProcessor implements PlatformNettyRequestProcessor {

    private static final Logger logger = LoggerFactory.getLogger(CallbackScheduleResultProcessor.class);

    @Override
    public PlatformRemotingCommand processRequest(ChannelHandlerContext channelHandlerContext, PlatformRemotingCommand platformRemotingCommand) throws Exception {
        return null;
    }

    @Override
    public boolean rejectRequest() {
        return false;
    }

}