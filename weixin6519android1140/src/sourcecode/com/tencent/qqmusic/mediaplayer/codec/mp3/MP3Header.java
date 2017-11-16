package com.tencent.qqmusic.mediaplayer.codec.mp3;

class MP3Header
{
  public static final int MPEG1 = 3;
  public static final int MPEG2 = 2;
  public static final int MPEG25 = 0;
  private int[][][] bitrate;
  private int bitrate_index;
  private int framesize;
  private int layer;
  private int lsf;
  private int mode;
  private int mode_extension;
  private int padding;
  private int protection_bit;
  private int[][] samplingRate;
  private int sampling_frequency;
  private int sideinfosize;
  private int verID;
  
  MP3Header()
  {
    int[] arrayOfInt3 = { 0, 32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448 };
    int[] arrayOfInt4 = { 0, 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384 };
    int[] arrayOfInt5 = { 0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320 };
    int[] arrayOfInt1 = { 0, 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256 };
    int[] arrayOfInt2 = { 0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160 };
    this.bitrate = new int[][][] { { arrayOfInt3, arrayOfInt4, arrayOfInt5 }, { arrayOfInt1, arrayOfInt2, { 0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160 } } };
    arrayOfInt1 = new int[] { 11025, 12000, 8000, 0 };
    arrayOfInt2 = new int[] { 22050, 24000, 16000, 0 };
    this.samplingRate = new int[][] { arrayOfInt1, { 0, 0, 0, 0 }, arrayOfInt2, { 44100, 48000, 32000, 0 } };
  }
  
  protected void decode(int paramInt)
  {
    int i = 17;
    this.verID = (paramInt >> 19 & 0x3);
    this.layer = (4 - (paramInt >> 17 & 0x3));
    this.protection_bit = (paramInt >> 16 & 0x1);
    this.bitrate_index = (paramInt >> 12 & 0xF);
    this.sampling_frequency = (paramInt >> 10 & 0x3);
    this.padding = (paramInt >> 9 & 0x1);
    this.mode = (paramInt >> 6 & 0x3);
    this.mode_extension = (paramInt >> 4 & 0x3);
    if (this.verID == 3) {}
    for (paramInt = 0;; paramInt = 1)
    {
      this.lsf = paramInt;
      switch (this.layer)
      {
      default: 
        return;
      }
    }
    this.framesize = (this.bitrate[this.lsf][0][this.bitrate_index] * 12000);
    this.framesize /= this.samplingRate[this.verID][this.sampling_frequency];
    this.framesize += this.padding;
    this.framesize <<= 2;
    return;
    this.framesize = (this.bitrate[this.lsf][1][this.bitrate_index] * 144000);
    this.framesize /= this.samplingRate[this.verID][this.sampling_frequency];
    this.framesize += this.padding;
    return;
    this.framesize = (this.bitrate[this.lsf][2][this.bitrate_index] * 144000);
    this.framesize /= (this.samplingRate[this.verID][this.sampling_frequency] << this.lsf);
    this.framesize += this.padding;
    if (this.verID == 3)
    {
      if (this.mode == 3) {}
      for (paramInt = 17;; paramInt = 32)
      {
        this.sideinfosize = paramInt;
        return;
      }
    }
    paramInt = i;
    if (this.mode == 3) {
      paramInt = 9;
    }
    this.sideinfosize = paramInt;
  }
  
  public int getFrameSize()
  {
    return this.framesize;
  }
  
  protected void initialize()
  {
    this.framesize = 0;
    this.sideinfosize = 0;
    this.layer = 0;
    this.verID = 1;
  }
  
  public boolean isProtected()
  {
    return this.protection_bit == 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\codec\mp3\MP3Header.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */