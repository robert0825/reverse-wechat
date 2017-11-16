package com.tencent.qqmusic.mediaplayer.seektable.flac;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;
import com.tencent.qqmusic.mediaplayer.seektable.ParsableInputStreamWrapper;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.InvalidBoxException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;

public class FlacSeekTable
  implements SeekTable
{
  private static final int SEEK_POINT_SIZE = 18;
  private static final byte TYPE_SEEKTABLE = 3;
  private static final byte TYPE_STREAMINFO = 0;
  public long firstFrameOffset;
  public long[] offsets;
  public long[] sampleNumbers;
  private int sampleRate = 0;
  
  public FlacSeekTable(int paramInt)
  {
    this.sampleRate = paramInt;
  }
  
  private static int binarySearchFloor(long[] paramArrayOfLong, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = Arrays.binarySearch(paramArrayOfLong, paramLong);
    int i;
    if (j < 0) {
      i = -(j + 2);
    }
    for (;;)
    {
      j = i;
      if (paramBoolean2) {
        j = Math.max(0, i);
      }
      return j;
      i = j;
      if (!paramBoolean1) {
        i = j - 1;
      }
    }
  }
  
  public static boolean seekToFirstFrame(Parsable paramParsable)
  {
    boolean bool2 = false;
    byte[] arrayOfByte1 = new byte[1];
    byte[] arrayOfByte2 = new byte[3];
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (paramParsable.available() > 0L)
      {
        if (i == 0) {
          break label83;
        }
        arrayOfByte1 = new byte[2];
        paramParsable.readBytes(arrayOfByte1, 0, 2);
        bool1 = bool2;
        if ((arrayOfByte1[0] & 0xFF) == 255)
        {
          bool1 = bool2;
          if ((arrayOfByte1[1] & 0xFF) >> 2 == 62) {
            bool1 = true;
          }
        }
      }
      return bool1;
      label83:
      paramParsable.readBytes(arrayOfByte1, 0, 1);
      if ((arrayOfByte1[0] & 0xFF) >> 7 == 1) {
        i = 1;
      }
      paramParsable.readBytes(arrayOfByte2, 0, 3);
      paramParsable.skip(BytesUtil.from(arrayOfByte2));
    }
  }
  
  private static boolean seekToFlac(Parsable paramParsable)
  {
    byte[] arrayOfByte = new byte[4];
    paramParsable.readBytes(arrayOfByte, 0, 4);
    if ((arrayOfByte[0] == 73) && (arrayOfByte[1] == 68) && (arrayOfByte[2] == 51))
    {
      paramParsable.skip(2L);
      paramParsable.skip(Id3Util.unsynchsafe(paramParsable.readInt()));
      paramParsable.readBytes(arrayOfByte, 0, 4);
    }
    return (arrayOfByte[0] == 102) && (arrayOfByte[1] == 76) && (arrayOfByte[2] == 97) && (arrayOfByte[3] == 67);
  }
  
  private static boolean walkThrough(Parsable paramParsable, BlockHandler... paramVarArgs)
  {
    byte[] arrayOfByte1 = new byte[1];
    byte[] arrayOfByte2 = new byte[3];
    HashSet localHashSet = new HashSet();
    if ((localHashSet.size() < paramVarArgs.length) && (paramParsable.available() > 0L))
    {
      paramParsable.readBytes(arrayOfByte1, 0, 1);
      int j = arrayOfByte1[0];
      int k = paramVarArgs.length;
      int i = 0;
      boolean bool = false;
      for (;;)
      {
        if (i < k)
        {
          BlockHandler localBlockHandler = paramVarArgs[i];
          bool = localBlockHandler.handle(paramParsable, j & 0x7F);
          if (bool) {
            localHashSet.add(Integer.valueOf(localBlockHandler.hashCode()));
          }
        }
        else
        {
          if (bool) {
            break;
          }
          if ((arrayOfByte1[0] & 0xFF) >> 7 == 1) {
            break label161;
          }
          paramParsable.readBytes(arrayOfByte2, 0, 3);
          paramParsable.skip(BytesUtil.from(arrayOfByte2));
          break;
        }
        i += 1;
      }
    }
    label161:
    return localHashSet.size() == paramVarArgs.length;
  }
  
  public long[] getOffsetRangeOfSample(int paramInt)
  {
    paramInt = binarySearchFloor(this.sampleNumbers, paramInt, true, true);
    if (paramInt + 1 >= this.offsets.length) {
      return new long[] { this.firstFrameOffset + this.offsets[paramInt], -1L };
    }
    return new long[] { this.firstFrameOffset + this.offsets[paramInt], this.firstFrameOffset + this.offsets[(paramInt + 1)] };
  }
  
  public void parse(InputStream paramInputStream)
  {
    ParsableInputStreamWrapper localParsableInputStreamWrapper = new ParsableInputStreamWrapper(paramInputStream);
    if (!seekToFlac(localParsableInputStreamWrapper)) {}
    for (;;)
    {
      return;
      if (this.sampleRate == 0)
      {
        paramInputStream = new BlockHandler[2];
        paramInputStream[0] = new SeektableHandler();
        paramInputStream[1] = new StreamInfoHandler();
      }
      while (!walkThrough(localParsableInputStreamWrapper, paramInputStream))
      {
        throw new InvalidBoxException("lack one or more critical BLOCK(s) to create seek table!");
        paramInputStream = new BlockHandler[1];
        paramInputStream[0] = new SeektableHandler();
      }
    }
  }
  
  public long seek(long paramLong)
  {
    int i = (int)(Math.round(paramLong / 1000.0D) * this.sampleRate);
    i = binarySearchFloor(this.sampleNumbers, i, true, true);
    paramLong = this.firstFrameOffset;
    return this.offsets[i] + paramLong;
  }
  
  private static abstract interface BlockHandler
  {
    public abstract boolean handle(Parsable paramParsable, int paramInt);
  }
  
  class SeektableHandler
    implements FlacSeekTable.BlockHandler
  {
    SeektableHandler() {}
    
    public boolean handle(Parsable paramParsable, int paramInt)
    {
      int i = 0;
      if (paramInt != 3) {
        return false;
      }
      byte[] arrayOfByte = new byte[3];
      paramParsable.readBytes(arrayOfByte, 0, 3);
      int j = BytesUtil.from(arrayOfByte) / 18;
      FlacSeekTable.this.sampleNumbers = new long[j];
      FlacSeekTable.this.offsets = new long[j];
      paramInt = i;
      while (paramInt < j)
      {
        FlacSeekTable.this.sampleNumbers[paramInt] = paramParsable.readLong();
        FlacSeekTable.this.offsets[paramInt] = paramParsable.readLong();
        paramParsable.skip(2L);
        paramInt += 1;
      }
      if (!FlacSeekTable.seekToFirstFrame(paramParsable)) {
        throw new InvalidBoxException("can't find audio frame!");
      }
      FlacSeekTable.this.firstFrameOffset = (paramParsable.tell() - 2L);
      return true;
    }
  }
  
  class StreamInfoHandler
    implements FlacSeekTable.BlockHandler
  {
    StreamInfoHandler() {}
    
    public boolean handle(Parsable paramParsable, int paramInt)
    {
      if (paramInt != 0) {
        return false;
      }
      paramParsable.skip(13L);
      paramParsable.readBytes(new byte[3], 0, 3);
      paramParsable.skip(21L);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\seektable\flac\FlacSeekTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */