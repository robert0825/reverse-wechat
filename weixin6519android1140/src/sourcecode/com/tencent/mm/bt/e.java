package com.tencent.mm.bt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ha;
import com.tencent.mm.g.a.ha.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.m.a.a;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.q;
import com.tencent.mm.storage.emotion.s;
import java.util.ArrayList;

public class e
{
  private static e vnJ;
  private String[] vnK;
  private String[] vnL;
  private String[] vnM;
  private ArrayList<s> vnN;
  private SparseArray<s> vnO;
  
  static
  {
    GMTrace.i(4516694982656L, 33652);
    vnJ = null;
    GMTrace.o(4516694982656L, 33652);
  }
  
  public e(Context paramContext)
  {
    GMTrace.i(4515487023104L, 33643);
    this.vnN = new ArrayList();
    this.vnO = new SparseArray();
    this.vnK = paramContext.getResources().getStringArray(a.a.aMr);
    this.vnL = paramContext.getResources().getStringArray(a.a.aMs);
    this.vnM = paramContext.getResources().getStringArray(a.a.hAa);
    this.vnN.clear();
    this.vnO.clear();
    bRz();
    GMTrace.o(4515487023104L, 33643);
  }
  
  public static e bRA()
  {
    GMTrace.i(4516023894016L, 33647);
    if (vnJ == null) {}
    try
    {
      vnJ = new e(ab.getContext());
      e locale = vnJ;
      GMTrace.o(4516023894016L, 33647);
      return locale;
    }
    finally {}
  }
  
  private void bRz()
  {
    int k = 0;
    GMTrace.i(4515621240832L, 33644);
    if ((this.vnK != null) && (this.vnL != null))
    {
      int m = this.vnK.length;
      int j = 0;
      int i = 0;
      s locals;
      while (j < m)
      {
        locals = new s(i, this.vnK[j]);
        this.vnN.add(locals);
        this.vnO.put(i, locals);
        j += 1;
        i += 1;
      }
      m = this.vnL.length;
      j = k;
      while (j < m)
      {
        locals = new s(i, this.vnL[j]);
        this.vnN.add(locals);
        this.vnO.put(i, locals);
        j += 1;
        i += 1;
      }
    }
    GMTrace.o(4515621240832L, 33644);
  }
  
  public void adn()
  {
    GMTrace.i(4515755458560L, 33645);
    w.d("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo");
    this.vnN.clear();
    ArrayList localArrayList1 = ((PluginEmoji)h.j(PluginEmoji.class)).getEmojiMgr().aqC();
    if ((localArrayList1 != null) && (!localArrayList1.isEmpty()))
    {
      ArrayList localArrayList2 = ((PluginEmoji)h.j(PluginEmoji.class)).getEmojiMgr().aqB();
      int k = localArrayList1.size();
      int j = 0;
      int i = 0;
      if (j < k)
      {
        s locals = (s)localArrayList1.get(j);
        String str = locals.field_key;
        if ((str.startsWith("[")) && (!localArrayList2.contains(str))) {
          w.i("MicroMsg.MergerSmileyManager", "no smiley info. key:%s", new Object[] { str });
        }
        for (;;)
        {
          j += 1;
          break;
          this.vnN.add(locals);
          this.vnO.put(i, locals);
          i += 1;
        }
      }
      GMTrace.o(4515755458560L, 33645);
      return;
    }
    bRz();
    GMTrace.o(4515755458560L, 33645);
  }
  
  public int ado()
  {
    GMTrace.i(4515889676288L, 33646);
    if (this.vnN == null)
    {
      GMTrace.o(4515889676288L, 33646);
      return 0;
    }
    int i = this.vnN.size();
    GMTrace.o(4515889676288L, 33646);
    return i;
  }
  
  public String getText(int paramInt)
  {
    GMTrace.i(4516292329472L, 33649);
    if (paramInt < 0)
    {
      w.w("MicroMsg.MergerSmileyManager", "get text, error index");
      GMTrace.o(4516292329472L, 33649);
      return "";
    }
    Object localObject = (s)this.vnN.get(paramInt);
    if (localObject != null)
    {
      q localq = f.bRB().Tc(((s)localObject).field_key);
      if (localq != null)
      {
        if ((v.bPH()) && (!bg.nm(localq.field_cnValue)))
        {
          localObject = localq.field_cnValue;
          GMTrace.o(4516292329472L, 33649);
          return (String)localObject;
        }
        if ((v.bPI()) && (!bg.nm(localq.field_twValue)))
        {
          localObject = localq.field_twValue;
          GMTrace.o(4516292329472L, 33649);
          return (String)localObject;
        }
      }
      localObject = ((s)localObject).field_key;
      GMTrace.o(4516292329472L, 33649);
      return (String)localObject;
    }
    GMTrace.o(4516292329472L, 33649);
    return "";
  }
  
  public Drawable kg(int paramInt)
  {
    GMTrace.i(4516158111744L, 33648);
    if (this.vnO == null)
    {
      w.i("MicroMsg.MergerSmileyManager", "getSmileyDrawable smiley panel map is null.");
      GMTrace.o(4516158111744L, 33648);
      return null;
    }
    Object localObject1 = (s)this.vnO.get(paramInt);
    if (localObject1 == null)
    {
      w.i("MicroMsg.MergerSmileyManager", "getSmileyDrawable smiley info is null.");
      GMTrace.o(4516158111744L, 33648);
      return null;
    }
    Object localObject2 = f.bRB().Tc(((s)localObject1).field_key);
    if (localObject2 != null)
    {
      f.bRB();
      paramInt = ((q)localObject2).field_position;
      if (paramInt >= 0) {}
      for (localObject1 = b.bRv().kg(paramInt);; localObject1 = f.Tb(((q)localObject2).field_fileName))
      {
        GMTrace.o(4516158111744L, 33648);
        return (Drawable)localObject1;
      }
    }
    localObject2 = b.bRv();
    localObject1 = ((s)localObject1).field_key;
    if (bg.nm((String)localObject1))
    {
      w.i("MicroMsg.EmojiHelper", "getEmoji item failed. key is null.");
      localObject1 = null;
    }
    for (;;)
    {
      localObject1 = b.bRv().a((c)localObject1);
      break;
      paramInt = ((String)localObject1).codePointAt(0);
      if (((b)localObject2).Aq(paramInt) != null) {
        localObject1 = ((b)localObject2).Aq(paramInt);
      } else {
        localObject1 = ((b)localObject2).ed(paramInt, 0);
      }
    }
  }
  
  public String kh(int paramInt)
  {
    GMTrace.i(4516560764928L, 33651);
    if (paramInt < 0)
    {
      w.w("MicroMsg.MergerSmileyManager", "get emoji text, error index down");
      GMTrace.o(4516560764928L, 33651);
      return "";
    }
    Object localObject1 = new ha();
    a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    if (((ha)localObject1).eKh.eDY == 1) {}
    for (int i = 1; i != 0; i = 0)
    {
      Object localObject2 = bRA().vnL[paramInt].split(" ");
      localObject1 = Character.toChars(Integer.decode(localObject2[0]).intValue());
      localObject2 = Character.toChars(Integer.decode(localObject2[1]).intValue());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append((char[])localObject1);
      localStringBuilder.append((char[])localObject2);
      localObject1 = localStringBuilder.toString();
      GMTrace.o(4516560764928L, 33651);
      return (String)localObject1;
    }
    localObject1 = bRA().vnL[paramInt];
    GMTrace.o(4516560764928L, 33651);
    return (String)localObject1;
  }
  
  public String ki(int paramInt)
  {
    GMTrace.i(4516426547200L, 33650);
    if (paramInt < 0)
    {
      w.w("MicroMsg.MergerSmileyManager", "get text, error index");
      GMTrace.o(4516426547200L, 33650);
      return "";
    }
    Object localObject = (s)this.vnN.get(paramInt);
    if (localObject != null)
    {
      localObject = ((s)localObject).field_key;
      GMTrace.o(4516426547200L, 33650);
      return (String)localObject;
    }
    GMTrace.o(4516426547200L, 33650);
    return "";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bt\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */