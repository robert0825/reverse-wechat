package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class q
  extends BaseAdapter
{
  private Context mContext;
  LinkedList<a> maR;
  List<a> maS;
  int maT;
  String maU;
  a maV;
  GameRankFooter maW;
  boolean maX;
  boolean maY;
  int maZ;
  
  public q(Context paramContext, GameRankFooter paramGameRankFooter)
  {
    GMTrace.i(12738738782208L, 94911);
    this.maT = 0;
    this.maX = false;
    this.maY = false;
    this.maZ = 0;
    this.mContext = paramContext;
    this.maR = new LinkedList();
    this.maS = new LinkedList();
    this.maU = com.tencent.mm.y.q.zE();
    this.maW = paramGameRankFooter;
    GMTrace.o(12738738782208L, 94911);
  }
  
  private boolean zT(String paramString)
  {
    GMTrace.i(12739544088576L, 94917);
    if (bg.nm(paramString))
    {
      GMTrace.o(12739544088576L, 94917);
      return false;
    }
    if (bg.nm(this.maU))
    {
      GMTrace.o(12739544088576L, 94917);
      return false;
    }
    boolean bool = this.maU.equals(paramString);
    this.maX = bool;
    GMTrace.o(12739544088576L, 94917);
    return bool;
  }
  
  public final void T(LinkedList<a> paramLinkedList)
  {
    int i = 25;
    GMTrace.i(12738872999936L, 94912);
    if (paramLinkedList.size() == 0)
    {
      w.i("MicroMsg.GameRankAdapter", "Null or empty rank info");
      GMTrace.o(12738872999936L, 94912);
      return;
    }
    this.maR.clear();
    this.maR.addAll(paramLinkedList);
    if (this.maR.size() > 25)
    {
      this.maT = i;
      this.maS = this.maR.subList(0, this.maT);
      this.maZ = 0;
      if ((this.maR != null) && (this.maR.size() > 0))
      {
        paramLinkedList = this.maR.iterator();
        while (paramLinkedList.hasNext())
        {
          a locala = (a)paramLinkedList.next();
          this.maZ += 1;
          if ((!bg.nm(locala.eQu)) && (locala.eQu.equals(this.maU))) {
            this.maV = locala;
          }
        }
      }
      if (this.maT != this.maR.size()) {
        break label253;
      }
      this.maW.aGH();
      this.maY = true;
    }
    for (;;)
    {
      if ((!this.maX) && (this.maZ > this.maT))
      {
        if (this.maV != null)
        {
          this.maW.a(this.maV);
          GMTrace.o(12738872999936L, 94912);
          return;
          i = this.maR.size();
          break;
          label253:
          this.maW.aGG();
          continue;
        }
        this.maW.aGI();
        GMTrace.o(12738872999936L, 94912);
        return;
      }
    }
    this.maW.aGI();
    GMTrace.o(12738872999936L, 94912);
  }
  
  public final int getCount()
  {
    GMTrace.i(12739007217664L, 94913);
    int i = this.maS.size();
    GMTrace.o(12739007217664L, 94913);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(12739141435392L, 94914);
    Object localObject = this.maS.get(paramInt);
    GMTrace.o(12739141435392L, 94914);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(12739275653120L, 94915);
    long l = paramInt;
    GMTrace.o(12739275653120L, 94915);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(12739409870848L, 94916);
    a locala;
    if (paramView == null)
    {
      paramViewGroup = new b();
      paramView = View.inflate(this.mContext, R.i.czn, null);
      paramViewGroup.mba = ((TextView)paramView.findViewById(R.h.bWl));
      paramViewGroup.mbb = ((ImageView)paramView.findViewById(R.h.bWk));
      paramViewGroup.mbc = ((ImageView)paramView.findViewById(R.h.cjF));
      paramViewGroup.mbd = ((TextView)paramView.findViewById(R.h.cjH));
      paramViewGroup.mbe = ((TextView)paramView.findViewById(R.h.cjL));
      paramViewGroup.mbf = ((ImageView)paramView.findViewById(R.h.cjG));
      paramView.setTag(paramViewGroup);
      locala = (a)getItem(paramInt);
      at.AR();
      Object localObject = c.yK().TE(locala.eQu);
      if (localObject != null)
      {
        a.b.a(paramViewGroup.mbc, ((af)localObject).field_username);
        localObject = new SpannableString(h.b(this.mContext, ((x)localObject).vk(), paramViewGroup.mbd.getTextSize()));
        paramViewGroup.mbd.setText((CharSequence)localObject);
      }
      paramViewGroup.mbe.setText(bg.formatNumber(locala.lxd));
      switch (locala.lOb)
      {
      default: 
        paramViewGroup.mba.setVisibility(0);
        paramViewGroup.mbb.setVisibility(8);
        paramViewGroup.mba.setText(locala.lOb);
        label306:
        switch (locala.level)
        {
        default: 
          paramViewGroup.mbf.setVisibility(8);
          label349:
          if (paramInt == 0) {
            if (getCount() == 1) {
              if (zT(locala.eQu)) {
                paramView.setBackgroundResource(R.g.aYj);
              }
            }
          }
          break;
        }
        break;
      }
    }
    for (;;)
    {
      GMTrace.o(12739409870848L, 94916);
      return paramView;
      paramViewGroup = (b)paramView.getTag();
      break;
      paramViewGroup.mba.setVisibility(8);
      paramViewGroup.mbb.setVisibility(0);
      paramViewGroup.mbb.setImageResource(R.g.aXc);
      break label306;
      paramViewGroup.mba.setVisibility(8);
      paramViewGroup.mbb.setVisibility(0);
      paramViewGroup.mbb.setImageResource(R.g.bay);
      break label306;
      paramViewGroup.mba.setVisibility(8);
      paramViewGroup.mbb.setVisibility(0);
      paramViewGroup.mbb.setImageResource(R.g.aUE);
      break label306;
      paramViewGroup.mbf.setVisibility(0);
      paramViewGroup.mbf.setImageResource(R.g.aWY);
      break label349;
      paramViewGroup.mbf.setVisibility(0);
      paramViewGroup.mbf.setImageResource(R.g.aWZ);
      break label349;
      paramViewGroup.mbf.setVisibility(0);
      paramViewGroup.mbf.setImageResource(R.g.aXa);
      break label349;
      paramViewGroup.mbf.setVisibility(0);
      paramViewGroup.mbf.setImageResource(R.g.aXb);
      break label349;
      paramView.setBackgroundResource(R.g.aYi);
      continue;
      if (zT(locala.eQu))
      {
        paramView.setBackgroundResource(R.g.aYp);
      }
      else
      {
        paramView.setBackgroundResource(R.g.aYo);
        continue;
        if (paramInt == getCount() - 1)
        {
          if (zT(locala.eQu))
          {
            if (this.maY) {
              paramView.setBackgroundResource(R.g.aYl);
            } else {
              paramView.setBackgroundResource(R.g.aYn);
            }
          }
          else if (this.maY) {
            paramView.setBackgroundResource(R.g.aYk);
          } else {
            paramView.setBackgroundResource(R.g.aYm);
          }
        }
        else
        {
          paramView.setBackgroundColor(Color.parseColor("#00000000"));
          if (zT(locala.eQu)) {
            paramView.setBackgroundResource(R.g.aYn);
          } else {
            paramView.setBackgroundResource(R.g.aYm);
          }
        }
      }
    }
  }
  
  public static final class a
    implements Serializable
  {
    public String eQu;
    public int lOb;
    public int level;
    public long lxd;
    
    public a()
    {
      GMTrace.i(12770951036928L, 95151);
      this.level = 0;
      GMTrace.o(12770951036928L, 95151);
    }
  }
  
  static final class b
  {
    public TextView mba;
    public ImageView mbb;
    public ImageView mbc;
    public TextView mbd;
    public TextView mbe;
    public ImageView mbf;
    
    b()
    {
      GMTrace.i(12674582708224L, 94433);
      GMTrace.o(12674582708224L, 94433);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\ui\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */