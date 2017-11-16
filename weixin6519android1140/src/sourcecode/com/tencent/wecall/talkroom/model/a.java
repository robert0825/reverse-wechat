package com.tencent.wecall.talkroom.model;

import com.tencent.pb.common.c.c;

public class a
{
  private static a yka = null;
  private f ykb = null;
  
  public static a cra()
  {
    if (yka == null) {}
    try
    {
      if (yka == null) {
        yka = new a();
      }
      return yka;
    }
    finally {}
  }
  
  public static f crb()
  {
    a locala = cra();
    if (locala.ykb == null) {}
    try
    {
      if (locala.ykb == null) {
        locala.ykb = new f();
      }
      return locala.ykb;
    }
    finally {}
  }
  
  public static void crc()
  {
    c.d("MicroMsg.Voip", new Object[] { "registerEvents" });
    crb();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */