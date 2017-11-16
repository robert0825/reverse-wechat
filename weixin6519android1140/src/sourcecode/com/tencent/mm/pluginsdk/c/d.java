package com.tencent.mm.pluginsdk.c;

import android.content.Context;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.aw.f;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.storage.al;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.q;
import com.tencent.mm.storage.emotion.s;
import java.util.ArrayList;
import java.util.List;

public abstract interface d
  extends e
{
  public abstract String a(Context paramContext, WXMediaMessage paramWXMediaMessage, String paramString);
  
  public abstract void a(Context paramContext, au paramau);
  
  public abstract void a(String paramString, EmojiInfo paramEmojiInfo, au paramau);
  
  public abstract boolean a(Context paramContext, EmojiInfo paramEmojiInfo, int paramInt, String paramString);
  
  public abstract boolean a(String paramString1, String paramString2, long paramLong, String paramString3, d.a parama);
  
  public abstract byte[] a(EmojiInfo paramEmojiInfo);
  
  public abstract ArrayList<q> aqA();
  
  public abstract ArrayList<String> aqB();
  
  public abstract ArrayList<s> aqC();
  
  public abstract f aqD();
  
  public abstract boolean aqz();
  
  public abstract al bT(String paramString1, String paramString2);
  
  public abstract String bU(String paramString1, String paramString2);
  
  public abstract void d(EmojiInfo paramEmojiInfo);
  
  public abstract int e(EmojiInfo paramEmojiInfo);
  
  public abstract int[] f(EmojiInfo paramEmojiInfo);
  
  public abstract boolean m(Context paramContext, String paramString1, String paramString2);
  
  public abstract boolean s(ArrayList<q> paramArrayList);
  
  public abstract boolean t(ArrayList<s> paramArrayList);
  
  public abstract EmojiInfo vP(String paramString);
  
  public abstract String vQ(String paramString);
  
  public abstract List<EmojiInfo> vR(String paramString);
  
  public abstract boolean vS(String paramString);
  
  public abstract ArrayList<String> vT(String paramString);
  
  public abstract String vU(String paramString);
  
  public abstract String vV(String paramString);
  
  public abstract int vW(String paramString);
  
  public abstract String vX(String paramString);
  
  public abstract void vY(String paramString);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */