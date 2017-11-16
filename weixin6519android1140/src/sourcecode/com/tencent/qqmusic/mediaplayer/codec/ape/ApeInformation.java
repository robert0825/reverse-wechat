package com.tencent.qqmusic.mediaplayer.codec.ape;

import com.tencent.qqmusic.mediaplayer.AudioInformation;

public class ApeInformation
  extends AudioInformation
{
  private String album;
  private int apeFileVersion;
  private String artist;
  private long blocks;
  private int compressionLevel;
  private int frames;
  private String title;
  private String writer;
  
  public String getAlbum()
  {
    return this.album;
  }
  
  public String getArtist()
  {
    return this.artist;
  }
  
  public long getBlocks()
  {
    return this.blocks;
  }
  
  public int getCompressionLevel()
  {
    return this.compressionLevel;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public String getWriter()
  {
    return this.writer;
  }
  
  public void setAlbum(String paramString)
  {
    this.album = paramString;
  }
  
  public void setArtist(String paramString)
  {
    this.artist = paramString;
  }
  
  public void setBlocks(long paramLong)
  {
    this.blocks = paramLong;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
  
  public void setWriter(String paramString)
  {
    this.writer = paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\codec\ape\ApeInformation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */