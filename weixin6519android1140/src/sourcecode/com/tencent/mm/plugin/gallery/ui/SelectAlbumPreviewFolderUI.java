package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.t;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.gallery.model.GalleryItem.AlbumItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.ImageMediaItem;
import com.tencent.mm.plugin.gallery.model.c;
import com.tencent.mm.plugin.gallery.model.g.a;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import java.util.ArrayList;

@a(19)
public class SelectAlbumPreviewFolderUI
  extends MMActivity
  implements g.a
{
  ArrayList<GalleryItem.AlbumItem> lDx;
  private a lFj;
  private RecyclerView lFk;
  GalleryItem.AlbumItem lFl;
  private String lFm;
  
  public SelectAlbumPreviewFolderUI()
  {
    GMTrace.i(15078824869888L, 112346);
    this.lDx = new ArrayList(0);
    GMTrace.o(15078824869888L, 112346);
  }
  
  public final void A(final ArrayList<GalleryItem.AlbumItem> paramArrayList)
  {
    GMTrace.i(15079495958528L, 112351);
    new ae(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15103386714112L, 112529);
        SelectAlbumPreviewFolderUI.a(SelectAlbumPreviewFolderUI.this).addAll(paramArrayList);
        SelectAlbumPreviewFolderUI.b(SelectAlbumPreviewFolderUI.this).TS.notifyChanged();
        GMTrace.o(15103386714112L, 112529);
      }
    });
    GMTrace.o(15079495958528L, 112351);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(15079227523072L, 112349);
    int i = R.i.cFG;
    GMTrace.o(15079227523072L, 112349);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(15079361740800L, 112350);
    super.onBackPressed();
    finish();
    GMTrace.o(15079361740800L, 112350);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(15078959087616L, 112347);
    super.onCreate(paramBundle);
    c.aCL().b(this);
    c.aCL().a(this);
    c.aCL().aDq();
    this.lFk = ((RecyclerView)findViewById(R.h.bAS));
    this.lFj = new a(this);
    this.lFk.a(new LinearLayoutManager());
    this.lFk.a(this.lFj);
    this.lFm = getIntent().getStringExtra("select_folder_name");
    this.lFl = new GalleryItem.AlbumItem("", 0);
    this.lFl.lBB = new GalleryItem.ImageMediaItem();
    sq(bg.nl(getString(R.l.cSU)));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(15090636029952L, 112434);
        SelectAlbumPreviewFolderUI.this.finish();
        GMTrace.o(15090636029952L, 112434);
        return false;
      }
    });
    GMTrace.o(15078959087616L, 112347);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(15079093305344L, 112348);
    super.onDestroy();
    c.aCL().b(this);
    GMTrace.o(15079093305344L, 112348);
  }
  
  final class a
    extends RecyclerView.a<SelectAlbumPreviewFolderUI.b>
    implements View.OnClickListener
  {
    Context mContext;
    
    public a(Context paramContext)
    {
      GMTrace.i(15103789367296L, 112532);
      this.mContext = paramContext;
      GMTrace.o(15103789367296L, 112532);
    }
    
    public final int getItemCount()
    {
      GMTrace.i(15103923585024L, 112533);
      int i = SelectAlbumPreviewFolderUI.a(SelectAlbumPreviewFolderUI.this).size();
      GMTrace.o(15103923585024L, 112533);
      return i + 1;
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(15104057802752L, 112534);
      Intent localIntent = new Intent(SelectAlbumPreviewFolderUI.this, AlbumPreviewUI.class);
      localIntent.putExtra("select_folder_name", (GalleryItem.AlbumItem)paramView.getTag());
      localIntent.setFlags(67108864);
      SelectAlbumPreviewFolderUI.this.setResult(-1, localIntent);
      SelectAlbumPreviewFolderUI.this.finish();
      GMTrace.o(15104057802752L, 112534);
    }
  }
  
  final class b
    extends RecyclerView.t
  {
    public TextView hqI;
    public ImageView lCw;
    public TextView lDB;
    public ImageView lDC;
    public View lFh;
    public ImageView lkf;
    
    public b(View paramView)
    {
      super();
      GMTrace.i(15091843989504L, 112443);
      this.lFh = paramView;
      this.lCw = ((ImageView)this.lFh.findViewById(R.h.bAU));
      this.hqI = ((TextView)this.lFh.findViewById(R.h.bAR));
      this.lkf = ((ImageView)this.lFh.findViewById(R.h.ckr));
      this.lDB = ((TextView)this.lFh.findViewById(R.h.bAQ));
      this.lDC = ((ImageView)this.lFh.findViewById(R.h.bAT));
      GMTrace.o(15091843989504L, 112443);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\ui\SelectAlbumPreviewFolderUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */