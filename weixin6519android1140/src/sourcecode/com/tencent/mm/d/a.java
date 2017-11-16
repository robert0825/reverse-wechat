package com.tencent.mm.d;

import com.tencent.gmtrace.GMTrace;

public enum a
{
  public int value;
  
  static
  {
    GMTrace.i(19655246741504L, 146443);
    evb = new a("DEFAULT", 0, 0);
    evc = new a("DOODLE", 1, 2);
    evd = new a("MOSAIC", 2, 1);
    eve = new a("EMOJI_AND_TEXT", 3, 3);
    evf = new a("CROP_PHOTO", 4, Integer.MAX_VALUE);
    evg = new a("CROP_VIDEO", 5, Integer.MAX_VALUE);
    evh = new a[] { evb, evc, evd, eve, evf, evg };
    GMTrace.o(19655246741504L, 146443);
  }
  
  private a(int paramInt)
  {
    GMTrace.i(19655112523776L, 146442);
    this.value = paramInt;
    GMTrace.o(19655112523776L, 146442);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */