package com.tencent.mm.storage;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import com.tencent.mm.plugin.messenger.foundation.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.e;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.e.g;
import com.tencent.mm.vending.b.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public abstract interface as
  extends g
{
  public abstract boolean Ch(String paramString);
  
  public abstract void TN(String paramString);
  
  public abstract ae TO(String paramString);
  
  public abstract void TP(String paramString);
  
  public abstract boolean TQ(String paramString);
  
  public abstract boolean TR(String paramString);
  
  public abstract boolean TS(String paramString);
  
  public abstract boolean TT(String paramString);
  
  public abstract boolean TU(String paramString);
  
  public abstract boolean TV(String paramString);
  
  public abstract Cursor TW(String paramString);
  
  public abstract Cursor TX(String paramString);
  
  public abstract int TY(String paramString);
  
  public abstract String TZ(String paramString);
  
  public abstract ae Ua(String paramString);
  
  public abstract int Ub(String paramString);
  
  public abstract void Uc(String paramString);
  
  public abstract void Ud(String paramString);
  
  public abstract int Ue(String paramString);
  
  public abstract int a(ae paramae, String paramString);
  
  public abstract int a(ae paramae, String paramString, boolean paramBoolean);
  
  public abstract Cursor a(String paramString1, List<String> paramList, String paramString2, boolean paramBoolean);
  
  public abstract Cursor a(ArrayList<String> paramArrayList, String paramString1, List<String> paramList, String paramString2);
  
  public abstract b a(e parame);
  
  public abstract void a(d paramd);
  
  public abstract void a(ae paramae, int paramInt1, int paramInt2);
  
  public abstract void a(a parama);
  
  public abstract void a(a parama, Looper paramLooper);
  
  public abstract void a(b paramb);
  
  public abstract boolean a(String paramString, int paramInt1, boolean paramBoolean, int paramInt2);
  
  public abstract String aG(int paramInt, String paramString);
  
  public abstract void ac(au paramau);
  
  public abstract void aw(LinkedList<String> paramLinkedList);
  
  public abstract Cursor b(String paramString1, List<String> paramList, boolean paramBoolean, String paramString2);
  
  public abstract void b(a parama);
  
  public abstract boolean bSX();
  
  public abstract boolean bSY();
  
  public abstract HashMap<String, Long> bSZ();
  
  public abstract void bTa();
  
  public abstract List<String> bTc();
  
  public abstract List<String> bTd();
  
  public abstract Cursor bTe();
  
  public abstract int bTf();
  
  public abstract String bTg();
  
  public abstract Cursor bTh();
  
  public abstract ae bTi();
  
  public abstract Cursor c(String paramString1, List<String> paramList, String paramString2);
  
  public abstract void c(a parama);
  
  public abstract Cursor cM(String paramString, int paramInt);
  
  public abstract long d(ae paramae);
  
  public abstract void e(String[] paramArrayOfString, String paramString);
  
  public abstract boolean f(ae paramae);
  
  public abstract Cursor ff(String paramString1, String paramString2);
  
  public abstract boolean g(ae paramae);
  
  public abstract int gu(String paramString);
  
  public abstract Cursor k(List<String> paramList, int paramInt);
  
  public abstract b pC();
  
  public abstract Cursor q(String paramString, List<String> paramList);
  
  public abstract Cursor r(String paramString, List<String> paramList);
  
  public abstract boolean yN(String paramString);
  
  public static abstract interface a
  {
    public abstract void a(ae paramae, as paramas);
  }
  
  public static abstract interface b
  {
    public abstract String a(int paramInt1, String paramString1, String paramString2, int paramInt2, Context paramContext);
    
    public abstract void a(au paramau, PString paramPString1, PString paramPString2, PInt paramPInt, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */