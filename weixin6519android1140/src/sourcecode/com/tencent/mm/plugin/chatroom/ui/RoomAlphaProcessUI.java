package com.tencent.mm.plugin.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.chatroom.d.o;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;

@a(3)
@Deprecated
public class RoomAlphaProcessUI
  extends MMActivity
  implements a.a
{
  private String chatroomName;
  
  public RoomAlphaProcessUI()
  {
    GMTrace.i(9149622517760L, 68170);
    GMTrace.o(9149622517760L, 68170);
  }
  
  private static void p(Runnable paramRunnable)
  {
    GMTrace.i(9150562041856L, 68177);
    new ae().postDelayed(paramRunnable, 200L);
    GMTrace.o(9150562041856L, 68177);
  }
  
  protected final void MP()
  {
    GMTrace.i(15403765989376L, 114767);
    GMTrace.o(15403765989376L, 114767);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(9150427824128L, 68176);
    GMTrace.o(9150427824128L, 68176);
    return -1;
  }
  
  public final void i(final boolean paramBoolean, final int paramInt)
  {
    GMTrace.i(9150696259584L, 68178);
    if (paramBoolean)
    {
      h.bm(this, getString(R.l.dUd));
      p(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9146669727744L, 68148);
          Intent localIntent = new Intent(RoomAlphaProcessUI.this, RoomUpgradeUI.class);
          localIntent.setFlags(603979776);
          localIntent.putExtra("room_name", RoomAlphaProcessUI.a(RoomAlphaProcessUI.this));
          localIntent.putExtra("upgrade_success", paramBoolean);
          localIntent.putExtra("left_quota", paramInt);
          RoomAlphaProcessUI.this.startActivity(localIntent);
          GMTrace.o(9146669727744L, 68148);
        }
      });
      GMTrace.o(9150696259584L, 68178);
      return;
    }
    h.a(this, getString(R.l.dUc), "", null);
    p(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9129087205376L, 68017);
        Intent localIntent = new Intent(RoomAlphaProcessUI.this, RoomUpgradeUI.class);
        localIntent.setFlags(603979776);
        localIntent.putExtra("room_name", RoomAlphaProcessUI.a(RoomAlphaProcessUI.this));
        localIntent.putExtra("upgrade_success", paramBoolean);
        RoomAlphaProcessUI.this.startActivity(localIntent);
        GMTrace.o(9129087205376L, 68017);
      }
    });
    GMTrace.o(9150696259584L, 68178);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9149756735488L, 68171);
    super.onCreate(paramBundle);
    this.chatroomName = getIntent().getStringExtra("RoomInfo_Id");
    paramBundle = new o(this.chatroomName);
    a.2 local2 = new a.2(false, h.a(this, getString(R.l.bKJ), false, new a.1()), this, this);
    at.wS().a(482, local2);
    at.wS().a(paramBundle, 0);
    GMTrace.o(9149756735488L, 68171);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9150159388672L, 68174);
    super.onDestroy();
    GMTrace.o(9150159388672L, 68174);
  }
  
  public void onPause()
  {
    GMTrace.i(9150025170944L, 68173);
    super.onPause();
    GMTrace.o(9150025170944L, 68173);
  }
  
  public void onResume()
  {
    GMTrace.i(9149890953216L, 68172);
    super.onResume();
    GMTrace.o(9149890953216L, 68172);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\RoomAlphaProcessUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */