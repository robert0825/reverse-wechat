package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.alj;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class a
  extends BaseAdapter
{
  String hiu;
  View.OnClickListener lgu;
  Context mContext;
  protected String nvb;
  boolean nvf;
  ArrayList<com.tencent.mm.plugin.nearlife.b.a> nvg;
  HashSet<String> nvh;
  ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> nvi;
  private Map<BackwardSupportUtil.ExifHelper.LatLongData, azp> nvj;
  private Map<BackwardSupportUtil.ExifHelper.LatLongData, Integer> nvk;
  Map<String, BackwardSupportUtil.ExifHelper.LatLongData> nvl;
  BackwardSupportUtil.ExifHelper.LatLongData nvm;
  boolean nvn;
  int nvo;
  
  public a(Context paramContext, View.OnClickListener paramOnClickListener, String paramString, boolean paramBoolean)
  {
    GMTrace.i(12550162874368L, 93506);
    this.nvf = false;
    this.hiu = "";
    this.nvg = new ArrayList();
    this.nvh = new HashSet();
    this.nvi = null;
    this.nvn = true;
    this.nvb = "";
    this.nvo = 0;
    this.mContext = paramContext;
    this.lgu = paramOnClickListener;
    this.hiu = paramString;
    this.nvf = paramBoolean;
    this.nvi = new ArrayList();
    this.nvj = new HashMap();
    this.nvk = new HashMap();
    this.nvl = new HashMap();
    GMTrace.o(12550162874368L, 93506);
  }
  
  public static String aY(List<azq> paramList)
  {
    GMTrace.i(12551102398464L, 93513);
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < paramList.size())
    {
      azq localazq = (azq)paramList.get(i);
      if ((localazq != null) && (localazq.uNR != null) && (!localazq.uNR.equals("")) && (!localazq.uNR.toLowerCase().equals("null")))
      {
        localStringBuffer.append(localazq.uNR);
        if (i < paramList.size() - 1) {
          localStringBuffer.append("·");
        }
      }
      i += 1;
    }
    paramList = localStringBuffer.toString();
    GMTrace.o(12551102398464L, 93513);
    return paramList;
  }
  
  public final void DR(String paramString)
  {
    GMTrace.i(18050002714624L, 134483);
    if (paramString != null) {
      this.nvb = paramString;
    }
    GMTrace.o(18050002714624L, 134483);
  }
  
  public final BackwardSupportUtil.ExifHelper.LatLongData DS(String paramString)
  {
    GMTrace.i(12551907704832L, 93519);
    if (this.nvl.containsKey(paramString))
    {
      paramString = (BackwardSupportUtil.ExifHelper.LatLongData)this.nvl.get(paramString);
      GMTrace.o(12551907704832L, 93519);
      return paramString;
    }
    GMTrace.o(12551907704832L, 93519);
    return null;
  }
  
  public final int DT(String paramString)
  {
    GMTrace.i(12552041922560L, 93520);
    Iterator localIterator = this.nvg.iterator();
    int i = -1;
    int j;
    com.tencent.mm.plugin.nearlife.b.a locala;
    do
    {
      j = i;
      if (!localIterator.hasNext()) {
        break;
      }
      locala = (com.tencent.mm.plugin.nearlife.b.a)localIterator.next();
      j = i + 1;
      i = j;
    } while (!locala.nuO.equals(paramString));
    GMTrace.o(12552041922560L, 93520);
    return j;
  }
  
  public final void K(ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> paramArrayList)
  {
    GMTrace.i(12551236616192L, 93514);
    if (paramArrayList != null) {
      this.nvi = paramArrayList;
    }
    GMTrace.o(12551236616192L, 93514);
  }
  
  public final azp a(BackwardSupportUtil.ExifHelper.LatLongData paramLatLongData)
  {
    GMTrace.i(12551370833920L, 93515);
    if (this.nvj.containsKey(paramLatLongData))
    {
      paramLatLongData = (azp)this.nvj.get(paramLatLongData);
      GMTrace.o(12551370833920L, 93515);
      return paramLatLongData;
    }
    GMTrace.o(12551370833920L, 93515);
    return null;
  }
  
  public final void a(com.tencent.mm.plugin.nearlife.b.a parama, int paramInt)
  {
    GMTrace.i(14298885652480L, 106535);
    if ((!this.nvh.contains(parama.nuO)) && (paramInt <= this.nvg.size()))
    {
      this.nvg.add(paramInt, parama);
      this.nvh.add(parama.nuO);
      this.nvl.put(parama.nuO, this.nvm);
    }
    GMTrace.o(14298885652480L, 106535);
  }
  
  public final void a(BackwardSupportUtil.ExifHelper.LatLongData paramLatLongData, int paramInt, azp paramazp)
  {
    int i = 0;
    GMTrace.i(12551773487104L, 93518);
    float f1 = paramLatLongData.eMl;
    float f2 = paramLatLongData.gIN;
    if (paramazp == null) {}
    for (;;)
    {
      w.d("MicroMsg.BaseLifeAdapter", "set flag & buf, lat:%f long:%f flag:%d len:%d", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(paramInt), Integer.valueOf(i) });
      if ((this.nvi.contains(paramLatLongData)) || ((this.nvm != null) && (this.nvm.equals(paramLatLongData))))
      {
        this.nvk.put(paramLatLongData, Integer.valueOf(paramInt));
        this.nvj.put(paramLatLongData, paramazp);
      }
      GMTrace.o(12551773487104L, 93518);
      return;
      i = paramazp.uNN;
    }
  }
  
  public final void a(BackwardSupportUtil.ExifHelper.LatLongData paramLatLongData, List<com.tencent.mm.plugin.nearlife.b.a> paramList)
  {
    GMTrace.i(12550565527552L, 93509);
    w.i("MicroMsg.BaseLifeAdapter", "mkey %s addlifes %d", new Object[] { this.hiu, Integer.valueOf(paramList.size()) });
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.tencent.mm.plugin.nearlife.b.a locala = (com.tencent.mm.plugin.nearlife.b.a)paramList.next();
      if (!this.nvh.contains(locala.nuO))
      {
        this.nvg.add(locala);
        this.nvh.add(locala.nuO);
        this.nvl.put(locala.nuO, paramLatLongData);
      }
    }
    notifyDataSetChanged();
    GMTrace.o(12550565527552L, 93509);
  }
  
  public final void aTP()
  {
    GMTrace.i(12550297092096L, 93507);
    this.nvg.clear();
    this.nvh.clear();
    this.nvk.clear();
    this.nvj.clear();
    this.nvl.clear();
    this.nvo = 0;
    notifyDataSetChanged();
    GMTrace.o(12550297092096L, 93507);
  }
  
  public final String aTQ()
  {
    GMTrace.i(18050136932352L, 134484);
    String str = this.nvb;
    GMTrace.o(18050136932352L, 134484);
    return str;
  }
  
  public final boolean aTR()
  {
    GMTrace.i(12551639269376L, 93517);
    Iterator localIterator = this.nvi.iterator();
    while (localIterator.hasNext()) {
      if (b((BackwardSupportUtil.ExifHelper.LatLongData)localIterator.next()) > 0)
      {
        GMTrace.o(12551639269376L, 93517);
        return true;
      }
    }
    if (this.nvn)
    {
      if (b(this.nvm) > 0)
      {
        GMTrace.o(12551639269376L, 93517);
        return true;
      }
      GMTrace.o(12551639269376L, 93517);
      return false;
    }
    GMTrace.o(12551639269376L, 93517);
    return false;
  }
  
  public final int b(BackwardSupportUtil.ExifHelper.LatLongData paramLatLongData)
  {
    GMTrace.i(12551505051648L, 93516);
    if (this.nvk.containsKey(paramLatLongData))
    {
      int i = ((Integer)this.nvk.get(paramLatLongData)).intValue();
      GMTrace.o(12551505051648L, 93516);
      return i;
    }
    GMTrace.o(12551505051648L, 93516);
    return 1;
  }
  
  public int getCount()
  {
    GMTrace.i(12550699745280L, 93510);
    int i = this.nvg.size();
    GMTrace.o(12550699745280L, 93510);
    return i;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(12550968180736L, 93512);
    GMTrace.o(12550968180736L, 93512);
    return 0L;
  }
  
  public final com.tencent.mm.plugin.nearlife.b.a rM(int paramInt)
  {
    GMTrace.i(14299019870208L, 106536);
    if ((paramInt >= 0) && (paramInt < this.nvg.size()))
    {
      locala = (com.tencent.mm.plugin.nearlife.b.a)this.nvg.get(paramInt);
      GMTrace.o(14299019870208L, 106536);
      return locala;
    }
    com.tencent.mm.plugin.nearlife.b.a locala = new com.tencent.mm.plugin.nearlife.b.a("", new alj());
    GMTrace.o(14299019870208L, 106536);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearlife\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */