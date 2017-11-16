package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.gallery.model.GalleryItem.AlbumItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.ImageMediaItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.c;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class b
  extends BaseAdapter
{
  private int lBW;
  private int lDA;
  ArrayList<GalleryItem.AlbumItem> lDx;
  GalleryItem.AlbumItem lDy;
  String lDz;
  private Context mContext;
  
  public b(Context paramContext, int paramInt)
  {
    GMTrace.i(11924574044160L, 88845);
    this.lDz = "";
    this.lDA = 0;
    this.mContext = paramContext;
    this.lDx = new ArrayList();
    this.lBW = paramInt;
    this.lDy = new GalleryItem.AlbumItem("", 0);
    this.lDy.lBB = new GalleryItem.ImageMediaItem();
    this.lDA = paramContext.getResources().getDimensionPixelSize(R.f.aQN);
    GMTrace.o(11924574044160L, 88845);
  }
  
  public final int getCount()
  {
    GMTrace.i(11924708261888L, 88846);
    int i = this.lDx.size();
    GMTrace.o(11924708261888L, 88846);
    return i + 1;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(11924976697344L, 88848);
    long l = paramInt;
    GMTrace.o(11924976697344L, 88848);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11925110915072L, 88849);
    w.i("MicroMsg.GalleryAdapter", "duanyi test getview:" + paramInt);
    GalleryItem.AlbumItem localAlbumItem = or(paramInt);
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.mContext).inflate(R.i.cFo, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.lCw = ((ImageView)paramView.findViewById(R.h.bAU));
      paramViewGroup.hqI = ((TextView)paramView.findViewById(R.h.bAR));
      paramViewGroup.lkf = ((ImageView)paramView.findViewById(R.h.ckr));
      paramViewGroup.lDB = ((TextView)paramView.findViewById(R.h.bAQ));
      paramViewGroup.lDC = ((ImageView)paramView.findViewById(R.h.bAT));
      paramView.setTag(paramViewGroup);
      if (!this.lDz.equals(localAlbumItem.lBA)) {
        break label283;
      }
      paramViewGroup.lDC.setVisibility(0);
      label162:
      if (paramInt != 0) {
        break label330;
      }
      paramViewGroup.lCw.setImageResource(R.g.aYT);
      if (localAlbumItem.lBB != null) {
        h.a(paramViewGroup.lCw, localAlbumItem.lBB.getType(), localAlbumItem.aDc(), localAlbumItem.lBB.gVn, localAlbumItem.aDd());
      }
      if (c.aCL().aDp() != 1) {
        break label294;
      }
      paramViewGroup.hqI.setText(R.l.dyG);
    }
    for (;;)
    {
      paramViewGroup.lCw.setVisibility(0);
      paramViewGroup.hqI.setVisibility(0);
      paramViewGroup.lDB.setVisibility(8);
      GMTrace.o(11925110915072L, 88849);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label283:
      paramViewGroup.lDC.setVisibility(4);
      break label162;
      label294:
      if (c.aCL().aDp() == 3) {
        paramViewGroup.hqI.setText(R.l.dyH);
      } else {
        paramViewGroup.hqI.setText(R.l.dyI);
      }
    }
    label330:
    paramViewGroup.lCw.setVisibility(0);
    paramViewGroup.hqI.setVisibility(0);
    paramViewGroup.hqI.setText(localAlbumItem.lBA);
    paramViewGroup.lDB.setVisibility(0);
    paramViewGroup.lDB.setText(this.mContext.getString(R.l.dyP, new Object[] { Integer.valueOf(localAlbumItem.eGL) }));
    Object localObject;
    if ((paramViewGroup.lkf != null) && (localAlbumItem.lBB != null))
    {
      localObject = paramViewGroup.lkf;
      if (localAlbumItem.lBB.getType() == 2)
      {
        paramInt = 0;
        ((ImageView)localObject).setVisibility(paramInt);
      }
    }
    else
    {
      localObject = localAlbumItem.aDc();
      if ((bg.nm((String)localObject)) || (localAlbumItem.lBB == null)) {
        break label508;
      }
      h.a(paramViewGroup.lCw, localAlbumItem.lBB.getType(), (String)localObject, localAlbumItem.lBB.gVn, localAlbumItem.aDd());
    }
    for (;;)
    {
      GMTrace.o(11925110915072L, 88849);
      return paramView;
      paramInt = 8;
      break;
      label508:
      if ((localAlbumItem.lBB != null) && (localAlbumItem.lBB.getType() == 2))
      {
        h.a(paramViewGroup.lCw, localAlbumItem.lBB.getType(), null, localAlbumItem.lBB.gVn, localAlbumItem.aDd());
      }
      else
      {
        w.e("MicroMsg.GalleryAdapter", "get folder failed");
        paramViewGroup.lCw.setVisibility(8);
        paramViewGroup.hqI.setVisibility(8);
      }
    }
  }
  
  public final GalleryItem.AlbumItem or(int paramInt)
  {
    GMTrace.i(11924842479616L, 88847);
    if (paramInt == 0)
    {
      localAlbumItem = this.lDy;
      GMTrace.o(11924842479616L, 88847);
      return localAlbumItem;
    }
    GalleryItem.AlbumItem localAlbumItem = (GalleryItem.AlbumItem)this.lDx.get(paramInt - 1);
    GMTrace.o(11924842479616L, 88847);
    return localAlbumItem;
  }
  
  private static final class a
  {
    public TextView hqI;
    public ImageView lCw;
    public TextView lDB;
    public ImageView lDC;
    public ImageView lkf;
    
    public a()
    {
      GMTrace.i(11947525275648L, 89016);
      GMTrace.o(11947525275648L, 89016);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */