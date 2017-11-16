package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.m.a.c;
import com.tencent.mm.plugin.m.a.e;
import com.tencent.mm.plugin.m.a.f;
import com.tencent.mm.plugin.m.a.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.pluginsdk.ui.emoji.PreViewEmojiView;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.base.HorizontalListView;
import com.tencent.mm.ui.base.HorizontalListView.a;
import com.tencent.mm.ui.base.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public final class m
{
  private View Hw;
  private AdapterView.OnItemClickListener WC;
  private int iSq;
  ArrayList<EmojiInfo> kqB;
  public Context mContext;
  public ae mHandler;
  public int tBa;
  int tBb;
  public q tBc;
  View tBd;
  public j tBe;
  public String tBf;
  public String tBg;
  public boolean tBh;
  private HorizontalListView tBi;
  public b tBj;
  private boolean tBk;
  private Comparator tBl;
  private HorizontalListView.a tBm;
  public a tzP;
  
  public m(Context paramContext)
  {
    GMTrace.i(16689840259072L, 124349);
    this.tBg = "";
    this.tBh = true;
    this.kqB = new ArrayList();
    this.iSq = 3;
    this.tBk = true;
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        int i = 0;
        GMTrace.i(998043025408L, 7436);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(998043025408L, 7436);
          return;
          paramAnonymousMessage = m.this;
          paramAnonymousMessage.mHandler.removeMessages(20001);
          Object localObject;
          label167:
          String str;
          if (paramAnonymousMessage.tBh)
          {
            localObject = paramAnonymousMessage.tBj;
            ((m.b)localObject).mData = paramAnonymousMessage.kqB;
            ((m.b)localObject).notifyDataSetInvalidated();
            if ((paramAnonymousMessage.kqB == null) || (paramAnonymousMessage.kqB.size() <= 2)) {
              break label242;
            }
            paramAnonymousMessage.tBc.setWidth((int)(paramAnonymousMessage.tBa * 2.5D) + paramAnonymousMessage.tBb * 2);
            paramAnonymousMessage.bMN();
            if ((paramAnonymousMessage.kqB == null) || (paramAnonymousMessage.kqB.size() < 3)) {
              break label304;
            }
            paramAnonymousMessage.mHandler.sendEmptyMessageDelayed(20001, 5000L);
            localObject = g.ork;
            str = paramAnonymousMessage.tBf;
            if (paramAnonymousMessage.kqB != null) {
              break label321;
            }
          }
          for (;;)
          {
            ((g)localObject).i(10994, new Object[] { Integer.valueOf(0), str, "", Integer.valueOf(0), "", Integer.valueOf(i) });
            GMTrace.o(998043025408L, 7436);
            return;
            label242:
            if ((paramAnonymousMessage.kqB != null) && (paramAnonymousMessage.kqB.size() == 2))
            {
              paramAnonymousMessage.tBc.setWidth(paramAnonymousMessage.tBa * 2 + paramAnonymousMessage.tBb * 2);
              break;
            }
            paramAnonymousMessage.tBc.setWidth(paramAnonymousMessage.tBa + paramAnonymousMessage.tBb * 2);
            break;
            label304:
            paramAnonymousMessage.mHandler.sendEmptyMessageDelayed(20001, 3000L);
            break label167;
            label321:
            i = paramAnonymousMessage.kqB.size();
          }
          m.this.hide();
          GMTrace.o(998043025408L, 7436);
          return;
          removeMessages(20001);
        }
      }
    };
    this.tBl = new Comparator() {};
    this.WC = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(1015893983232L, 7569);
        if (m.this.tBj == null) {}
        for (paramAnonymousAdapterView = null;; paramAnonymousAdapterView = m.this.tBj.mK(paramAnonymousInt))
        {
          if ((paramAnonymousAdapterView != null) && (m.this.tBe != null) && (m.this.tzP != null))
          {
            m.this.tBe.l(paramAnonymousAdapterView);
            m.this.tzP.clear();
            g.ork.i(10994, new Object[] { Integer.valueOf(1), m.this.tBf, "", Integer.valueOf(paramAnonymousInt), paramAnonymousAdapterView.GS(), Integer.valueOf(m.this.tBj.getCount()) });
          }
          m.this.tBc.dismiss();
          GMTrace.o(1015893983232L, 7569);
          return;
        }
      }
    };
    this.tBm = new HorizontalListView.a()
    {
      public final boolean q(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(990929485824L, 7383);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(990929485824L, 7383);
          return false;
          m.this.mHandler.sendEmptyMessage(20002);
          continue;
          m.this.mHandler.sendEmptyMessageDelayed(20001, 3000L);
        }
      }
    };
    this.mContext = paramContext;
    this.Hw = View.inflate(this.mContext, a.f.kwo, null);
    this.tBi = ((HorizontalListView)this.Hw.findViewById(a.e.kwn));
    this.tBj = new b();
    this.tBi.setAdapter(this.tBj);
    this.tBi.setOnItemClickListener(this.WC);
    this.tBi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
    {
      public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(980057849856L, 7302);
        w.d("MicroMsg.emoji.SuggestEmoticonBubble", "onItemSelected ...");
        GMTrace.o(980057849856L, 7302);
      }
      
      public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
      {
        GMTrace.i(980192067584L, 7303);
        GMTrace.o(980192067584L, 7303);
      }
    });
    this.tBi.tBm = this.tBm;
    this.tBa = a.V(this.mContext, a.c.kvL);
    this.tBb = a.V(this.mContext, a.c.aQw);
    this.tBc = new q(this.Hw, this.tBa + this.tBb * 2, this.tBa + this.tBb * 2, true);
    this.tBc.setBackgroundDrawable(new ColorDrawable(0));
    this.tBc.setOutsideTouchable(true);
    this.tBc.setFocusable(false);
    GMTrace.o(16689840259072L, 124349);
  }
  
  public final void bMN()
  {
    GMTrace.i(983950163968L, 7331);
    if (this.tBd != null)
    {
      int[] arrayOfInt = new int[2];
      this.tBd.getLocationOnScreen(arrayOfInt);
      int i = arrayOfInt[0];
      int j = (this.tBc.getWidth() - this.tBd.getWidth()) / 2;
      int k = arrayOfInt[1];
      int m = this.tBc.getHeight();
      this.tBc.showAtLocation(this.tBd, 0, i - j, k - m);
    }
    GMTrace.o(983950163968L, 7331);
  }
  
  public final boolean br(String paramString)
  {
    GMTrace.i(984218599424L, 7333);
    for (;;)
    {
      Object localObject;
      int i;
      try
      {
        if (!bg.nm(paramString))
        {
          localObject = ((PluginEmoji)h.j(PluginEmoji.class)).getEmojiMgr().vT(paramString);
          if ((localObject != null) && (!((ArrayList)localObject).isEmpty()))
          {
            this.tBf = paramString.replaceAll(",", "");
            if ((localObject == null) || (((ArrayList)localObject).isEmpty()))
            {
              GMTrace.o(984218599424L, 7333);
              return false;
            }
            paramString = new ArrayList();
            this.kqB.clear();
            int j = ((ArrayList)localObject).size();
            i = 0;
            if ((i < j) && (i < 100))
            {
              localEmojiInfo = ((PluginEmoji)h.j(PluginEmoji.class)).getEmojiMgr().vP((String)((ArrayList)localObject).get(i));
              if (localEmojiInfo == null) {
                break label394;
              }
              paramString.add(localEmojiInfo);
              break label394;
            }
            if (paramString.isEmpty())
            {
              w.i("MicroMsg.emoji.SuggestEmoticonBubble", "sorEmojiList return. empty list.");
              GMTrace.o(984218599424L, 7333);
              return false;
            }
            if (!this.tBk) {
              break label305;
            }
            localObject = (EmojiInfo)Collections.max(paramString, this.tBl);
            this.kqB.add(localObject);
            paramString = paramString.iterator();
            if (!paramString.hasNext()) {
              break label355;
            }
            EmojiInfo localEmojiInfo = (EmojiInfo)paramString.next();
            if ((localEmojiInfo.bK(localObject)) || (this.kqB.contains(localEmojiInfo))) {
              continue;
            }
            this.kqB.add(localEmojiInfo);
            continue;
          }
        }
        paramString = paramString.iterator();
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.emoji.SuggestEmoticonBubble", bg.f(paramString));
        this.tBf = "";
        GMTrace.o(984218599424L, 7333);
        return false;
      }
      label305:
      while (paramString.hasNext())
      {
        localObject = (EmojiInfo)paramString.next();
        if (!this.kqB.contains(localObject)) {
          this.kqB.add(localObject);
        }
      }
      label355:
      if ((this.kqB == null) || (this.kqB.isEmpty()))
      {
        GMTrace.o(984218599424L, 7333);
        return false;
      }
      GMTrace.o(984218599424L, 7333);
      return true;
      label394:
      i += 1;
    }
  }
  
  public final void hide()
  {
    GMTrace.i(984084381696L, 7332);
    if (this.tBc == null)
    {
      GMTrace.o(984084381696L, 7332);
      return;
    }
    if (this.tBc.isShowing()) {
      this.tBc.dismiss();
    }
    GMTrace.o(984084381696L, 7332);
  }
  
  public static abstract interface a
  {
    public abstract void clear();
  }
  
  final class b
    extends BaseAdapter
  {
    ArrayList<EmojiInfo> mData;
    
    b()
    {
      GMTrace.i(1030389497856L, 7677);
      GMTrace.o(1030389497856L, 7677);
    }
    
    public final int getCount()
    {
      GMTrace.i(1030523715584L, 7678);
      if (this.mData == null)
      {
        GMTrace.o(1030523715584L, 7678);
        return 0;
      }
      int i = this.mData.size();
      GMTrace.o(1030523715584L, 7678);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(1030792151040L, 7680);
      long l = paramInt;
      GMTrace.o(1030792151040L, 7680);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(1030926368768L, 7681);
      EmojiInfo localEmojiInfo;
      String str;
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramView = LayoutInflater.from(m.this.mContext).inflate(a.f.kwp, null);
        paramViewGroup = new m.c(m.this, paramView);
        paramView.setTag(paramViewGroup);
        localEmojiInfo = mK(paramInt);
        paramViewGroup.kna.mSize = m.this.tBa;
        paramViewGroup.kna.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        str = "";
        if (localEmojiInfo != null) {
          str = ((PluginEmoji)h.j(PluginEmoji.class)).getEmojiMgr().vM(localEmojiInfo.GS());
        }
        if (!bg.nm(str)) {
          break label209;
        }
        paramViewGroup.kna.setContentDescription(m.this.mContext.getString(a.h.dpj));
        label147:
        if (localEmojiInfo == null) {
          break label235;
        }
        if (!localEmojiInfo.bUP()) {
          break label221;
        }
        paramViewGroup.kna.a(EmojiInfo.bd(m.this.mContext, localEmojiInfo.getName()), localEmojiInfo.getName());
      }
      for (;;)
      {
        GMTrace.o(1030926368768L, 7681);
        return paramView;
        paramViewGroup = (m.c)paramView.getTag();
        break;
        label209:
        paramViewGroup.kna.setContentDescription(str);
        break label147;
        label221:
        paramViewGroup.kna.a(localEmojiInfo, "");
        continue;
        label235:
        w.w("MicroMsg.emoji.SuggestEmoticonBubble", "emoji info is null.");
      }
    }
    
    public final EmojiInfo mK(int paramInt)
    {
      GMTrace.i(1030657933312L, 7679);
      if ((this.mData != null) && (this.mData.size() > paramInt))
      {
        EmojiInfo localEmojiInfo = (EmojiInfo)this.mData.get(paramInt);
        GMTrace.o(1030657933312L, 7679);
        return localEmojiInfo;
      }
      GMTrace.o(1030657933312L, 7679);
      return null;
    }
  }
  
  final class c
  {
    PreViewEmojiView kna;
    
    public c(View paramView)
    {
      GMTrace.i(1027705143296L, 7657);
      this.kna = ((PreViewEmojiView)paramView.findViewById(a.e.kwm));
      this.kna.mSize = m.this.tBa;
      GMTrace.o(1027705143296L, 7657);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\chat\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */