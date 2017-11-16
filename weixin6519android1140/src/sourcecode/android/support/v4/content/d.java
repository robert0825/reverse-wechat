package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class d
{
  private static final Object mLock = new Object();
  private static d sR;
  private final Handler mHandler;
  final Context sN;
  final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> sO = new HashMap();
  private final HashMap<String, ArrayList<b>> sP = new HashMap();
  final ArrayList<a> sQ = new ArrayList();
  
  private d(Context paramContext)
  {
    this.sN = paramContext;
    this.mHandler = new Handler(paramContext.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        switch (paramAnonymousMessage.what)
        {
        default: 
          super.handleMessage(paramAnonymousMessage);
          return;
        }
        paramAnonymousMessage = d.this;
        for (;;)
        {
          synchronized (paramAnonymousMessage.sO)
          {
            i = paramAnonymousMessage.sQ.size();
            if (i <= 0) {
              return;
            }
          }
          d.a[] arrayOfa = new d.a[i];
          paramAnonymousMessage.sQ.toArray(arrayOfa);
          paramAnonymousMessage.sQ.clear();
          int i = 0;
          while (i < arrayOfa.length)
          {
            ??? = arrayOfa[i];
            int j = 0;
            while (j < ???.sT.size())
            {
              ((d.b)???.sT.get(j)).sU.onReceive(paramAnonymousMessage.sN, ???.intent);
              j += 1;
            }
            i += 1;
          }
        }
      }
    };
  }
  
  public static d l(Context paramContext)
  {
    synchronized (mLock)
    {
      if (sR == null) {
        sR = new d(paramContext.getApplicationContext());
      }
      paramContext = sR;
      return paramContext;
    }
  }
  
  public final void a(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    synchronized (this.sO)
    {
      b localb = new b(paramIntentFilter, paramBroadcastReceiver);
      Object localObject2 = (ArrayList)this.sO.get(paramBroadcastReceiver);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new ArrayList(1);
        this.sO.put(paramBroadcastReceiver, localObject1);
      }
      ((ArrayList)localObject1).add(paramIntentFilter);
      int i = 0;
      while (i < paramIntentFilter.countActions())
      {
        localObject2 = paramIntentFilter.getAction(i);
        localObject1 = (ArrayList)this.sP.get(localObject2);
        paramBroadcastReceiver = (BroadcastReceiver)localObject1;
        if (localObject1 == null)
        {
          paramBroadcastReceiver = new ArrayList(1);
          this.sP.put(localObject2, paramBroadcastReceiver);
        }
        paramBroadcastReceiver.add(localb);
        i += 1;
      }
      return;
    }
  }
  
  public final boolean a(Intent paramIntent)
  {
    int i;
    label139:
    int j;
    int k;
    ArrayList localArrayList1;
    synchronized (this.sO)
    {
      String str1 = paramIntent.getAction();
      String str2 = paramIntent.resolveTypeIfNeeded(this.sN.getContentResolver());
      Uri localUri = paramIntent.getData();
      String str3 = paramIntent.getScheme();
      Set localSet = paramIntent.getCategories();
      if ((paramIntent.getFlags() & 0x8) == 0) {
        break label421;
      }
      i = 1;
      if (i != 0) {
        new StringBuilder("Resolving type ").append(str2).append(" scheme ").append(str3).append(" of intent ").append(paramIntent);
      }
      ArrayList localArrayList2 = (ArrayList)this.sP.get(paramIntent.getAction());
      if (localArrayList2 == null) {
        break label395;
      }
      if (i == 0) {
        break label406;
      }
      new StringBuilder("Action list: ").append(localArrayList2);
      break label406;
      if (j >= localArrayList2.size()) {
        break label438;
      }
      b localb = (b)localArrayList2.get(j);
      if (i != 0) {
        new StringBuilder("Matching against filter ").append(localb.filter);
      }
      if (localb.sV)
      {
        if (i == 0) {
          break label400;
        }
        break label414;
      }
      k = localb.filter.match(str1, str2, str3, localUri, localSet, "LocalBroadcastManager");
      if (k >= 0)
      {
        if (i != 0) {
          new StringBuilder("  Filter matched!  match=0x").append(Integer.toHexString(k));
        }
        if (localArrayList1 != null) {
          break label403;
        }
        localArrayList1 = new ArrayList();
        label259:
        localArrayList1.add(localb);
        localb.sV = true;
      }
    }
    if (i != 0) {
      switch (k)
      {
      default: 
        break;
      }
    }
    for (;;)
    {
      if (i < localArrayList1.size())
      {
        ((b)localArrayList1.get(i)).sV = false;
        i += 1;
      }
      else
      {
        this.sQ.add(new a(paramIntent, localArrayList1));
        if (!this.mHandler.hasMessages(1)) {
          this.mHandler.sendEmptyMessage(1);
        }
        return true;
        label395:
        label400:
        label403:
        label406:
        label414:
        label421:
        label438:
        do
        {
          return false;
          break label414;
          break label259;
          localArrayList1 = null;
          j = 0;
          break label139;
          for (;;)
          {
            j += 1;
            break label139;
            i = 0;
            break;
            continue;
            continue;
          }
        } while (localArrayList1 == null);
        i = 0;
      }
    }
  }
  
  public final void unregisterReceiver(BroadcastReceiver paramBroadcastReceiver)
  {
    for (;;)
    {
      int k;
      int i;
      synchronized (this.sO)
      {
        ArrayList localArrayList1 = (ArrayList)this.sO.remove(paramBroadcastReceiver);
        if (localArrayList1 != null) {
          break label167;
        }
        return;
        if (j < localArrayList1.size())
        {
          IntentFilter localIntentFilter = (IntentFilter)localArrayList1.get(j);
          k = 0;
          if (k >= localIntentFilter.countActions()) {
            break label188;
          }
          String str = localIntentFilter.getAction(k);
          ArrayList localArrayList2 = (ArrayList)this.sP.get(str);
          if (localArrayList2 == null) {
            break label179;
          }
          i = 0;
          if (i < localArrayList2.size())
          {
            if (((b)localArrayList2.get(i)).sU == paramBroadcastReceiver)
            {
              localArrayList2.remove(i);
              i -= 1;
              break label172;
            }
          }
          else
          {
            if (localArrayList2.size() > 0) {
              break label179;
            }
            this.sP.remove(str);
            break label179;
          }
        }
        else
        {
          return;
        }
      }
      break label172;
      label167:
      int j = 0;
      continue;
      label172:
      i += 1;
      continue;
      label179:
      k += 1;
      continue;
      label188:
      j += 1;
    }
  }
  
  private static final class a
  {
    final Intent intent;
    final ArrayList<d.b> sT;
    
    a(Intent paramIntent, ArrayList<d.b> paramArrayList)
    {
      this.intent = paramIntent;
      this.sT = paramArrayList;
    }
  }
  
  private static final class b
  {
    final IntentFilter filter;
    final BroadcastReceiver sU;
    boolean sV;
    
    b(IntentFilter paramIntentFilter, BroadcastReceiver paramBroadcastReceiver)
    {
      this.filter = paramIntentFilter;
      this.sU = paramBroadcastReceiver;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(128);
      localStringBuilder.append("Receiver{");
      localStringBuilder.append(this.sU);
      localStringBuilder.append(" filter=");
      localStringBuilder.append(this.filter);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\android\support\v4\content\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */