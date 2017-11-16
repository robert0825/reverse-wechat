package com.tencent.mm.plugin.talkroom.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.br.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.MMHorList;
import com.tencent.mm.ui.base.MMHorList.a;
import java.util.LinkedList;
import java.util.List;

public class TalkRoomAvatarsFrame
  extends FrameLayout
{
  private final int ljP;
  private String mAd;
  private ae mHandler;
  private final int qys;
  private final int qyt;
  private MMHorList qyu;
  a qyv;
  private aj qyw;
  
  public TalkRoomAvatarsFrame(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5176911986688L, 38571);
    this.qys = 2000;
    this.qyt = 5;
    this.ljP = a.fromDPToPix(null, 58);
    MP();
    GMTrace.o(5176911986688L, 38571);
  }
  
  public TalkRoomAvatarsFrame(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5177046204416L, 38572);
    this.qys = 2000;
    this.qyt = 5;
    this.ljP = a.fromDPToPix(null, 58);
    MP();
    GMTrace.o(5177046204416L, 38572);
  }
  
  private void MP()
  {
    GMTrace.i(5177180422144L, 38573);
    inflate(getContext(), R.i.cGU, this);
    this.qyu = ((MMHorList)findViewById(R.h.bGj));
    this.qyu.wdi = true;
    this.qyu.wdh = true;
    this.qyu.wdj = this.ljP;
    this.qyv = new a(getContext());
    this.qyu.setAdapter(this.qyv);
    this.mHandler = new ae(Looper.getMainLooper());
    this.qyu.wcS = new MMHorList.a()
    {
      public final void aMy()
      {
        GMTrace.i(5182683348992L, 38614);
        TalkRoomAvatarsFrame.c(TalkRoomAvatarsFrame.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5183488655360L, 38620);
            TalkRoomAvatarsFrame.b(TalkRoomAvatarsFrame.this).notifyDataSetChanged();
            GMTrace.o(5183488655360L, 38620);
          }
        });
        GMTrace.o(5182683348992L, 38614);
      }
      
      public final void bsD()
      {
        GMTrace.i(5182414913536L, 38612);
        TalkRoomAvatarsFrame.a(TalkRoomAvatarsFrame.this).stopTimer();
        GMTrace.o(5182414913536L, 38612);
      }
      
      public final void bsE()
      {
        GMTrace.i(5182549131264L, 38613);
        TalkRoomAvatarsFrame.a(TalkRoomAvatarsFrame.this).z(2000L, 2000L);
        GMTrace.o(5182549131264L, 38613);
      }
    };
    this.qyw = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5180535865344L, 38598);
        TalkRoomAvatarsFrame.d(TalkRoomAvatarsFrame.this);
        GMTrace.o(5180535865344L, 38598);
        return false;
      }
    }, false);
    GMTrace.o(5177180422144L, 38573);
  }
  
  private void aJY()
  {
    GMTrace.i(5177448857600L, 38575);
    this.qyv.mAd = this.mAd;
    if (bg.nm(this.mAd))
    {
      this.qyv.notifyDataSetChanged();
      GMTrace.o(5177448857600L, 38575);
      return;
    }
    if (this.qyu.nsy)
    {
      GMTrace.o(5177448857600L, 38575);
      return;
    }
    a locala = this.qyv;
    String str = this.mAd;
    int i = locala.qyz.indexOf(str) * this.ljP;
    int j = this.qyu.wcV;
    if (i < j)
    {
      this.qyu.Ca(i);
      GMTrace.o(5177448857600L, 38575);
      return;
    }
    if (i > j + this.ljP * 4)
    {
      this.qyu.Ca(i - this.ljP * 4);
      GMTrace.o(5177448857600L, 38575);
      return;
    }
    this.qyv.notifyDataSetChanged();
    GMTrace.o(5177448857600L, 38575);
  }
  
  public final void JF(String paramString)
  {
    GMTrace.i(5177314639872L, 38574);
    if (this.qyu == null)
    {
      GMTrace.o(5177314639872L, 38574);
      return;
    }
    if ((bg.nm(this.mAd)) && (bg.nm(paramString)))
    {
      GMTrace.o(5177314639872L, 38574);
      return;
    }
    if ((!bg.nm(this.mAd)) && (this.mAd.equals(paramString)))
    {
      GMTrace.o(5177314639872L, 38574);
      return;
    }
    this.mAd = paramString;
    aJY();
    GMTrace.o(5177314639872L, 38574);
  }
  
  private static final class a
    extends BaseAdapter
  {
    String mAd;
    private Context mContext;
    List<String> qyz;
    
    public a(Context paramContext)
    {
      GMTrace.i(5176240898048L, 38566);
      this.qyz = new LinkedList();
      this.mContext = paramContext;
      GMTrace.o(5176240898048L, 38566);
    }
    
    public final int getCount()
    {
      GMTrace.i(5176375115776L, 38567);
      int i = this.qyz.size();
      GMTrace.o(5176375115776L, 38567);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(5176509333504L, 38568);
      Object localObject = this.qyz.get(paramInt);
      GMTrace.o(5176509333504L, 38568);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5176643551232L, 38569);
      GMTrace.o(5176643551232L, 38569);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(5176777768960L, 38570);
      String str = (String)this.qyz.get(paramInt);
      ImageView localImageView;
      if (paramView == null)
      {
        paramView = View.inflate(this.mContext, R.i.cGV, null);
        paramViewGroup = new a();
        paramViewGroup.hqG = ((ImageView)paramView.findViewById(R.h.bJe));
        paramViewGroup.jpV = ((TextView)paramView.findViewById(R.h.ciP));
        paramView.setTag(paramViewGroup);
        localImageView = paramViewGroup.hqG;
        if (!str.equals(this.mAd)) {
          break label149;
        }
      }
      label149:
      for (paramInt = R.g.baM;; paramInt = 0)
      {
        localImageView.setBackgroundResource(paramInt);
        paramViewGroup.jpV.setVisibility(8);
        a.b.b(paramViewGroup.hqG, str, true);
        GMTrace.o(5176777768960L, 38570);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
      }
    }
    
    final class a
    {
      public ImageView hqG;
      public TextView jpV;
      
      a()
      {
        GMTrace.i(5179998994432L, 38594);
        GMTrace.o(5179998994432L, 38594);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\ui\TalkRoomAvatarsFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */