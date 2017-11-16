package c.t.m.g;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.CellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class cy
  extends PhoneStateListener
{
  volatile boolean a;
  private final cj b;
  private final TelephonyManager c;
  private df d = null;
  private ServiceState e = null;
  private HandlerThread f;
  private Handler g;
  private Runnable h;
  private Handler i;
  private List<String> j;
  
  public cy(cj paramcj)
  {
    this.b = paramcj;
    this.c = paramcj.b();
    this.h = new Runnable()
    {
      public final void run()
      {
        cy.a(cy.this);
        cy.this.a = true;
      }
    };
  }
  
  private void a(int paramInt)
  {
    try
    {
      this.b.b().listen(this, paramInt);
      return;
    }
    catch (Throwable localThrowable)
    {
      new StringBuilder("listenCellState: failed! flags=").append(paramInt).append(localThrowable.toString());
    }
  }
  
  private void a(List<df> paramList)
  {
    df localdf = null;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    paramList = localdf;
    if (localIterator.hasNext())
    {
      localdf = (df)localIterator.next();
      localArrayList.add(localdf.b());
      if ((this.j == null) || (this.j.contains(localdf.b()))) {
        break label137;
      }
      paramList = localdf;
    }
    label137:
    for (;;)
    {
      break;
      this.j = localArrayList;
      if (paramList != null)
      {
        this.d = paramList;
        if ((this.a) && (this.d != null) && (this.b != null)) {}
      }
      else
      {
        return;
      }
      try
      {
        this.b.c(this.d);
        return;
      }
      finally
      {
        paramList = finally;
        throw paramList;
      }
    }
  }
  
  public final void a()
  {
    if (!this.a) {
      return;
    }
    this.a = false;
    a(0);
    try
    {
      if (this.g != null)
      {
        this.g.removeCallbacksAndMessages(null);
        this.g = null;
      }
      if (this.f != null)
      {
        this.f.quit();
        this.f = null;
      }
      this.e = null;
      if (this.j != null) {
        this.j = null;
      }
      return;
    }
    finally {}
  }
  
  @SuppressLint({"NewApi"})
  public final void a(Handler paramHandler, boolean paramBoolean)
  {
    if (this.a) {}
    for (;;)
    {
      return;
      this.i = paramHandler;
      if (this.j == null) {
        this.j = new ArrayList();
      }
      this.f = new HandlerThread("new_cell_provider");
      if (this.f == null) {
        continue;
      }
      try
      {
        this.f.start();
        this.g = new a(this.f.getLooper(), (byte)0);
        this.g.post(this.h);
        if (paramBoolean) {
          continue;
        }
        this.g.sendEmptyMessage(0);
        return;
      }
      catch (Throwable paramHandler)
      {
        for (;;)
        {
          this.g = new a(this.i.getLooper(), (byte)0);
        }
      }
    }
  }
  
  @SuppressLint({"NewApi"})
  public final void onCellInfoChanged(List<CellInfo> paramList)
  {
    ArrayList localArrayList;
    if ((paramList != null) && (paramList.size() > 0))
    {
      localArrayList = new ArrayList();
      paramList = paramList.iterator();
      label126:
      while (paramList.hasNext())
      {
        Object localObject = (CellInfo)paramList.next();
        if (((CellInfo)localObject).isRegistered())
        {
          localObject = df.a(this.b, (CellInfo)localObject);
          if ((((df)localObject).b < 0) || (((df)localObject).c < 0) || (((df)localObject).b == 535) || (((df)localObject).c == 535)) {}
          for (int k = 0;; k = 1)
          {
            if (k == 0) {
              break label126;
            }
            localArrayList.add(localObject);
            break;
          }
        }
      }
      if (localArrayList.size() > 0) {
        a(localArrayList);
      }
    }
    do
    {
      return;
      paramList = dt.a(this.b);
      if (paramList != null)
      {
        localArrayList = new ArrayList();
        localArrayList.add(df.a(this.b, paramList, null));
        a(localArrayList);
        return;
      }
    } while (this.d == null);
    paramList = new ArrayList();
    paramList.add(this.d);
    a(paramList);
  }
  
  public final void onServiceStateChanged(ServiceState paramServiceState)
  {
    int m = 1;
    int i1 = 0;
    super.onServiceStateChanged(paramServiceState);
    if (paramServiceState == null) {}
    for (;;)
    {
      return;
      try
      {
        ServiceState localServiceState = this.e;
        if ((localServiceState != null) && (localServiceState.getState() == paramServiceState.getState())) {
          continue;
        }
        this.e = paramServiceState;
        if (!this.a) {
          continue;
        }
        int k;
        boolean bool;
        if (this.e != null) {
          if (this.e.getState() == 0)
          {
            k = 1;
            paramServiceState = this.b.b();
            bool = dt.a(this.b.a);
            if (paramServiceState == null) {
              break label175;
            }
            if (paramServiceState.getSimState() != 5) {
              break label164;
            }
            break label177;
          }
        }
        for (;;)
        {
          paramServiceState = new Message();
          paramServiceState.what = 12999;
          paramServiceState.arg1 = 12003;
          paramServiceState.arg2 = n;
          this.b.c(paramServiceState);
          return;
          k = this.e.getState();
          if (k == 1)
          {
            k = 0;
            break;
          }
          k = -1;
          break;
          label164:
          m = 0;
          label175:
          label177:
          do
          {
            n = k;
            break;
            m = 0;
            n = i1;
            if (bool) {
              break;
            }
          } while (m != 0);
          int n = i1;
        }
        return;
      }
      catch (Throwable paramServiceState) {}
    }
  }
  
  final class a
    extends Handler
  {
    private a(Looper paramLooper)
    {
      super();
    }
    
    @SuppressLint({"NewApi"})
    public final void handleMessage(Message paramMessage)
    {
      if (!cy.this.a) {}
      do
      {
        return;
        paramMessage = null;
        if (cy.b(cy.this) != null) {}
        try
        {
          List localList = cy.b(cy.this).getAllCellInfo();
          paramMessage = localList;
        }
        catch (Throwable localThrowable)
        {
          for (;;) {}
        }
        cy.this.onCellInfoChanged(paramMessage);
      } while (cy.c(cy.this) == null);
      sendEmptyMessageDelayed(0, 30000L);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */