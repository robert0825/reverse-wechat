package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Ftyp
  extends Box
{
  int[] compatibleBrands;
  int majorBrand;
  int minorVersion;
  
  public void parse(Parsable paramParsable, Box paramBox)
  {
    super.parse(paramParsable, paramBox);
    this.majorBrand = paramParsable.readInt();
    this.minorVersion = paramParsable.readInt();
    int i = (int)paramParsable.available() / 4;
    if (i > 0) {
      this.compatibleBrands = paramParsable.readIntArray(i);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\seektable\mpeg4\boxes\Ftyp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */