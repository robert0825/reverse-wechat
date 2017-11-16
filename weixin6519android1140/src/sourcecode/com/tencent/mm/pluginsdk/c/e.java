package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.ao.a.a;
import com.tencent.mm.protocal.c.bef;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;

public abstract interface e
{
  public abstract void a(bef parambef);
  
  public abstract boolean a(EmojiGroupInfo paramEmojiGroupInfo);
  
  public abstract byte[] a(EmojiInfo paramEmojiInfo);
  
  public abstract bef aqE();
  
  public abstract int aqF();
  
  public abstract ArrayList<EmojiGroupInfo> aqG();
  
  public abstract int aqH();
  
  public abstract ArrayList<EmojiInfo> aqI();
  
  public abstract a aqJ();
  
  public abstract boolean aqK();
  
  public abstract EmojiInfo c(EmojiInfo paramEmojiInfo);
  
  public abstract void f(j.a parama);
  
  public abstract void g(j.a parama);
  
  public abstract void h(j.a parama);
  
  public abstract void i(j.a parama);
  
  public abstract void onDestroy();
  
  public abstract String vM(String paramString);
  
  public abstract int vZ(String paramString);
  
  public abstract ArrayList<EmojiInfo> wa(String paramString);
  
  public abstract String zo();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */