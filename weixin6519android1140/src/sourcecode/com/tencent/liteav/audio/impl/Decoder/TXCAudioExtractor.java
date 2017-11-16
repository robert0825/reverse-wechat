package com.tencent.liteav.audio.impl.Decoder;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.enums.TXEAudioTypeDef;
import com.tencent.liteav.basic.structs.TXSAudioPacket;
import java.io.IOException;
import java.nio.ByteBuffer;

@TargetApi(16)
public class TXCAudioExtractor
{
  private static final int SAMPLES_PER_FRAME = 1024;
  private static final String TAG = TXCAudioExtractor.class.getSimpleName();
  private MediaExtractor mAudioExtractor = new MediaExtractor();
  private MediaFormat mAudioFormat;
  private float mBeginRange = 0.0F;
  private long mDuration;
  private float mEndRange = 1.0F;
  
  private void prepareMediaFileInfo()
  {
    int i = 0;
    while (i < this.mAudioExtractor.getTrackCount())
    {
      MediaFormat localMediaFormat = this.mAudioExtractor.getTrackFormat(i);
      if (localMediaFormat.getString("mime").startsWith("audio"))
      {
        this.mAudioFormat = localMediaFormat;
        this.mAudioExtractor.selectTrack(i);
      }
      i += 1;
    }
  }
  
  public int getAudioType()
  {
    if (this.mAudioFormat == null) {
      return TXEAudioDef.TXE_AUDIO_TYPE_INVALID;
    }
    if (this.mAudioFormat.getString("mime").equals("audio/mp4a-latm")) {
      return TXEAudioDef.TXE_AUDIO_TYPE_AAC;
    }
    if (this.mAudioFormat.getString("mime").equals("audio/mpeg")) {
      return TXEAudioDef.TXE_AUDIO_TYPE_MP3;
    }
    return TXEAudioDef.TXE_AUDIO_TYPE_INVALID;
  }
  
  public long getDuration()
  {
    if (this.mAudioFormat == null) {
      return 0L;
    }
    try
    {
      if (this.mDuration == 0L) {
        this.mDuration = (((float)this.mAudioFormat.getLong("durationUs") * (this.mEndRange - this.mBeginRange)));
      }
      long l = this.mDuration;
      return l;
    }
    catch (NullPointerException localNullPointerException) {}
    return 0L;
  }
  
  public TXSAudioPacket readAudioSampleData()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(1024);
    if (this.mAudioExtractor.readSampleData(localByteBuffer, 0) == -1) {
      return null;
    }
    this.mAudioExtractor.advance();
    TXSAudioPacket localTXSAudioPacket = new TXSAudioPacket();
    localByteBuffer.get(localTXSAudioPacket.audioData);
    this.mAudioExtractor.readSampleData(localByteBuffer, 0);
    localTXSAudioPacket.timestamp = this.mAudioExtractor.getSampleTime();
    localTXSAudioPacket.sampleRate = this.mAudioFormat.getInteger("sample-rate");
    localTXSAudioPacket.channelsPerSample = this.mAudioFormat.getInteger("channel-count");
    localTXSAudioPacket.bitsPerChannel = TXEAudioTypeDef.TXE_BITS_PER_CHANNEL_16;
    localTXSAudioPacket.packetType = this.mAudioFormat.getInteger("audio-session-id");
    if (this.mAudioFormat.getString("mime").equals("audio/mp4a-latm"))
    {
      localTXSAudioPacket.packetType = TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_AAC_DATA;
      return localTXSAudioPacket;
    }
    if (this.mAudioFormat.getString("mime").equals("audio/mpeg"))
    {
      localTXSAudioPacket.packetType = TXEAudioTypeDef.TXE_AUDIO_PACKET_MP3_DATA;
      return localTXSAudioPacket;
    }
    localTXSAudioPacket.packetType = TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_INVALID;
    return localTXSAudioPacket;
  }
  
  public void release()
  {
    this.mAudioExtractor.release();
  }
  
  public void seekAudio(float paramFloat)
  {
    if ((paramFloat > 1.0F) || (paramFloat < 0.0F)) {
      return;
    }
    this.mAudioExtractor.seekTo(((float)getDuration() * paramFloat), 0);
  }
  
  public boolean setDataSource(String paramString)
  {
    try
    {
      this.mAudioExtractor.setDataSource(paramString);
      prepareMediaFileInfo();
      return true;
    }
    catch (IOException paramString) {}
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\liteav\audio\impl\Decoder\TXCAudioExtractor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */