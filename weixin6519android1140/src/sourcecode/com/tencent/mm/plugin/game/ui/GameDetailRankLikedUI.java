package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.plugin.game.c.au;
import com.tencent.mm.plugin.game.c.cm;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.util.LinkedList;
import java.util.List;

public class GameDetailRankLikedUI
  extends MMActivity
{
  private static final String TAG;
  private Dialog iBR;
  private ListView lWv;
  private a lWw;
  
  static
  {
    GMTrace.i(12657805492224L, 94308);
    TAG = "MicroMsg" + GameDetailRankLikedUI.class.getSimpleName();
    GMTrace.o(12657805492224L, 94308);
  }
  
  public GameDetailRankLikedUI()
  {
    GMTrace.i(12656865968128L, 94301);
    GMTrace.o(12656865968128L, 94301);
  }
  
  protected final void MP()
  {
    GMTrace.i(12657268621312L, 94304);
    oM(R.l.dzL);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12686528086016L, 94522);
        GameDetailRankLikedUI.this.finish();
        GMTrace.o(12686528086016L, 94522);
        return true;
      }
    });
    this.lWv = ((ListView)findViewById(R.h.bDJ));
    this.lWw = new a(this);
    this.lWv.setAdapter(this.lWw);
    this.iBR = com.tencent.mm.plugin.game.d.c.cD(this.vKB.vKW);
    this.iBR.show();
    GMTrace.o(12657268621312L, 94304);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12657134403584L, 94303);
    int i = R.i.cyC;
    GMTrace.o(12657134403584L, 94303);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12657000185856L, 94302);
    super.onCreate(paramBundle);
    MP();
    paramBundle = getIntent().getStringExtra("extra_appdi");
    if (bg.nm(paramBundle))
    {
      finish();
      GMTrace.o(12657000185856L, 94302);
      return;
    }
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new com.tencent.mm.plugin.game.c.at();
    ((b.a)localObject).gtG = new au();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getuplist";
    ((b.a)localObject).gtE = 1331;
    localObject = ((b.a)localObject).DA();
    ((com.tencent.mm.plugin.game.c.at)((b)localObject).gtC.gtK).lPg = paramBundle;
    u.a((b)localObject, new u.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, k paramAnonymousk)
      {
        GMTrace.i(12677669715968L, 94456);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          w.e(GameDetailRankLikedUI.QL(), "CGI return is not OK. (%d, %d)(%s)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          GameDetailRankLikedUI.this.finish();
          GMTrace.o(12677669715968L, 94456);
          return 0;
        }
        paramAnonymousb = (au)paramAnonymousb.gtD.gtK;
        paramAnonymousString = GameDetailRankLikedUI.a(GameDetailRankLikedUI.this);
        paramAnonymousb = paramAnonymousb.lRI;
        if (paramAnonymousb != null)
        {
          paramAnonymousString.lWy.clear();
          paramAnonymousString.lWy.addAll(paramAnonymousb);
          paramAnonymousString.notifyDataSetChanged();
        }
        GameDetailRankLikedUI.b(GameDetailRankLikedUI.this).dismiss();
        GMTrace.o(12677669715968L, 94456);
        return 0;
      }
    });
    GMTrace.o(12657000185856L, 94302);
  }
  
  private static final class a
    extends BaseAdapter
  {
    List<cm> lWy;
    private Context mContext;
    
    public a(Context paramContext)
    {
      GMTrace.i(12773903826944L, 95173);
      this.lWy = new LinkedList();
      this.mContext = paramContext;
      GMTrace.o(12773903826944L, 95173);
    }
    
    private cm oP(int paramInt)
    {
      GMTrace.i(12774172262400L, 95175);
      cm localcm = (cm)this.lWy.get(paramInt);
      GMTrace.o(12774172262400L, 95175);
      return localcm;
    }
    
    public final int getCount()
    {
      GMTrace.i(12774038044672L, 95174);
      int i = this.lWy.size();
      GMTrace.o(12774038044672L, 95174);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(12774306480128L, 95176);
      long l = paramInt;
      GMTrace.o(12774306480128L, 95176);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(12774440697856L, 95177);
      cm localcm;
      if (paramView == null)
      {
        paramView = LayoutInflater.from(this.mContext).inflate(R.i.cyD, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.gDc = ((ImageView)paramView.findViewById(R.h.bDG));
        paramViewGroup.iCs = ((TextView)paramView.findViewById(R.h.bDH));
        paramViewGroup.lWz = ((TextView)paramView.findViewById(R.h.bDI));
        paramView.setTag(paramViewGroup);
        localcm = oP(paramInt);
        a.b.a(paramViewGroup.gDc, localcm.lSY, 0.5F, false);
        com.tencent.mm.y.at.AR();
        Object localObject = com.tencent.mm.y.c.yK().TE(localcm.lSY);
        if (localObject == null) {
          break label199;
        }
        localObject = new SpannableString(h.b(this.mContext, ((x)localObject).vk(), paramViewGroup.iCs.getTextSize()));
        paramViewGroup.iCs.setText((CharSequence)localObject);
      }
      for (;;)
      {
        paramViewGroup.lWz.setText(localcm.lSZ);
        GMTrace.o(12774440697856L, 95177);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label199:
        paramViewGroup.iCs.setText("");
      }
    }
    
    private static final class a
    {
      public ImageView gDc;
      public TextView iCs;
      public TextView lWz;
      
      public a()
      {
        GMTrace.i(12763569061888L, 95096);
        GMTrace.o(12763569061888L, 95096);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameDetailRankLikedUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */