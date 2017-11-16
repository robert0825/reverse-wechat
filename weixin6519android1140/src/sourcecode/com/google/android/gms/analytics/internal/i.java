package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.c.v;
import com.google.android.gms.common.internal.w;

public final class i
  extends o
{
  public SharedPreferences act;
  private long acu;
  private long acv = -1L;
  final a acw = new a("monitoring", ((Long)aj.afd.get()).longValue());
  
  protected i(q paramq)
  {
    super(paramq);
  }
  
  public final void J(String paramString)
  {
    q.iK();
    iC();
    SharedPreferences.Editor localEditor = this.act.edit();
    if (TextUtils.isEmpty(paramString)) {
      localEditor.remove("installation_campaign");
    }
    for (;;)
    {
      if (!localEditor.commit()) {
        Q("Failed to commit campaign data");
      }
      return;
      localEditor.putString("installation_campaign", paramString);
    }
  }
  
  protected final void hS()
  {
    this.act = this.ack.mContext.getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
  }
  
  public final long ie()
  {
    q.iK();
    iC();
    long l;
    if (this.acu == 0L)
    {
      l = this.act.getLong("first_run", 0L);
      if (l == 0L) {
        break label45;
      }
    }
    for (this.acu = l;; this.acu = l)
    {
      return this.acu;
      label45:
      l = this.ack.acz.currentTimeMillis();
      SharedPreferences.Editor localEditor = this.act.edit();
      localEditor.putLong("first_run", l);
      if (!localEditor.commit()) {
        Q("Failed to commit first run time");
      }
    }
  }
  
  public final j jdMethod_if()
  {
    return new j(this.ack.acz, ie());
  }
  
  public final long ig()
  {
    q.iK();
    iC();
    if (this.acv == -1L) {
      this.acv = this.act.getLong("last_dispatch", 0L);
    }
    return this.acv;
  }
  
  public final void ih()
  {
    q.iK();
    iC();
    long l = this.ack.acz.currentTimeMillis();
    SharedPreferences.Editor localEditor = this.act.edit();
    localEditor.putLong("last_dispatch", l);
    localEditor.apply();
    this.acv = l;
  }
  
  public final String ii()
  {
    q.iK();
    iC();
    String str = this.act.getString("installation_campaign", null);
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    return str;
  }
  
  public final class a
  {
    final long acx;
    private final String mName;
    
    public a(String paramString, long paramLong)
    {
      w.af(paramString);
      if (paramLong > 0L) {}
      for (boolean bool = true;; bool = false)
      {
        w.af(bool);
        this.mName = paramString;
        this.acx = paramLong;
        return;
      }
    }
    
    private String il()
    {
      return this.mName + ":start";
    }
    
    void ij()
    {
      long l = i.this.ack.acz.currentTimeMillis();
      SharedPreferences.Editor localEditor = i.this.act.edit();
      localEditor.remove(im());
      localEditor.remove(in());
      localEditor.putLong(il(), l);
      localEditor.commit();
    }
    
    long ik()
    {
      return i.this.act.getLong(il(), 0L);
    }
    
    String im()
    {
      return this.mName + ":count";
    }
    
    String in()
    {
      return this.mName + ":value";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */