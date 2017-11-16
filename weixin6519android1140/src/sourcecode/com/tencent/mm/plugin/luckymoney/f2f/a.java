package com.tencent.mm.plugin.luckymoney.f2f;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class a
{
  public SoundPool mFg;
  public Hashtable<String, Integer> mFh;
  public Map<Integer, Boolean> mFi;
  public volatile boolean mFj;
  
  public a()
  {
    GMTrace.i(9783801282560L, 72895);
    this.mFj = false;
    this.mFg = new SoundPool(2, 3, 0);
    this.mFh = new Hashtable();
    this.mFi = new HashMap();
    GMTrace.o(9783801282560L, 72895);
  }
  
  public final void dD(String paramString)
  {
    GMTrace.i(9783935500288L, 72896);
    if (this.mFh.containsKey(paramString))
    {
      int i = ((Integer)this.mFh.get(paramString)).intValue();
      if ((i >= 0) && (this.mFi.containsKey(Integer.valueOf(i))) && (((Boolean)this.mFi.get(Integer.valueOf(i))).booleanValue())) {
        this.mFg.play(i, 1.0F, 1.0F, 0, 0, 1.0F);
      }
    }
    GMTrace.o(9783935500288L, 72896);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\f2f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */