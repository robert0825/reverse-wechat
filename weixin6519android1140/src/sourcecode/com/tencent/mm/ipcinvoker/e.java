package com.tencent.mm.ipcinvoker;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.b.b.a;
import com.tencent.mm.sdk.platformtools.w;

public class e
{
  public e()
  {
    GMTrace.i(18693039849472L, 139274);
    GMTrace.o(18693039849472L, 139274);
  }
  
  public static Bundle a(Parcelable paramParcelable, Class<?> paramClass)
  {
    GMTrace.i(18693710938112L, 139279);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("__remote_task_data", paramParcelable);
    localBundle.putString("__remote_task_class", paramClass.getName());
    GMTrace.o(18693710938112L, 139279);
    return localBundle;
  }
  
  public static <T extends k> Bundle a(String paramString, Bundle paramBundle, Class<T> paramClass)
  {
    GMTrace.i(18693308284928L, 139276);
    if (paramString.length() == 0)
    {
      w.e("IPC.IPCInvoker", "invokeSync failed, process is null or nil.");
      GMTrace.o(18693308284928L, 139276);
      return null;
    }
    if (d.em(paramString))
    {
      paramString = (k)n.a(paramClass, k.class);
      if (paramString == null)
      {
        w.e("IPC.IPCInvoker", "invokeSync failed, newInstance(%s) return null.", new Object[] { paramClass });
        GMTrace.o(18693308284928L, 139276);
        return null;
      }
      paramString = paramString.l(paramBundle);
      GMTrace.o(18693308284928L, 139276);
      return paramString;
    }
    com.tencent.mm.ipcinvoker.b.a locala = b.vN().ek(paramString);
    if (locala == null)
    {
      w.e("IPC.IPCInvoker", "invokeSync failed, get bridge is null by process(%s).", new Object[] { paramString });
      GMTrace.o(18693308284928L, 139276);
      return null;
    }
    try
    {
      paramString = locala.d(paramBundle, paramClass.getName());
      if (paramString != null) {
        paramString.setClassLoader(e.class.getClassLoader());
      }
      GMTrace.o(18693308284928L, 139276);
      return paramString;
    }
    catch (RemoteException paramString)
    {
      w.d("IPC.IPCInvoker", "invokeSync failed, ipc invoke error : %s", new Object[] { paramString });
      GMTrace.o(18693308284928L, 139276);
    }
    return null;
  }
  
  public static <T extends i<InputType, ResultType>, InputType extends Parcelable, ResultType extends Parcelable> ResultType a(String paramString, InputType paramInputType, Class<T> paramClass)
  {
    GMTrace.i(18693576720384L, 139278);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("IPC.IPCInvoker", "invokeSync failed, process is null or nil.");
      GMTrace.o(18693576720384L, 139278);
      return null;
    }
    if (d.em(paramString))
    {
      paramString = ((b)n.a(b.class, b.class)).l(a(paramInputType, paramClass));
      if (paramString == null)
      {
        GMTrace.o(18693576720384L, 139278);
        return null;
      }
      paramString.setClassLoader(e.class.getClassLoader());
      paramString = paramString.getParcelable("__remote_task_result_data");
      GMTrace.o(18693576720384L, 139278);
      return paramString;
    }
    com.tencent.mm.ipcinvoker.b.a locala = b.vN().ek(paramString);
    if (locala == null)
    {
      w.e("IPC.IPCInvoker", "invokeSync failed, get bridge is null by process(%s).", new Object[] { paramString });
      GMTrace.o(18693576720384L, 139278);
      return null;
    }
    try
    {
      paramString = locala.d(a(paramInputType, paramClass), b.class.getName());
      if (paramString == null)
      {
        GMTrace.o(18693576720384L, 139278);
        return null;
      }
      paramString.setClassLoader(e.class.getClassLoader());
      paramString = paramString.getParcelable("__remote_task_result_data");
      GMTrace.o(18693576720384L, 139278);
      return paramString;
    }
    catch (RemoteException paramString)
    {
      w.d("IPC.IPCInvoker", "invokeSync failed, ipc invoke error : %s", new Object[] { paramString });
      GMTrace.o(18693576720384L, 139278);
    }
    return null;
  }
  
  public static <T extends a> boolean a(String paramString, final Bundle paramBundle, final Class<T> paramClass, final c paramc)
  {
    GMTrace.i(18693174067200L, 139275);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("IPC.IPCInvoker", "invokeAsync failed, process is null or nil.");
      GMTrace.o(18693174067200L, 139275);
      return false;
    }
    boolean bool = l.d(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18692637196288L, 139271);
        if (d.em(this.fVh))
        {
          localObject = (a)n.a(paramClass, a.class);
          if (localObject == null)
          {
            w.e("IPC.IPCInvoker", "invokeAsync failed, newInstance(%s) return null.", new Object[] { paramClass });
            GMTrace.o(18692637196288L, 139271);
            return;
          }
          ((a)localObject).a(paramBundle, paramc);
          GMTrace.o(18692637196288L, 139271);
          return;
        }
        com.tencent.mm.ipcinvoker.b.a locala = b.vN().ek(this.fVh);
        if (locala == null)
        {
          w.e("IPC.IPCInvoker", "invokeAsync failed, get bridge is null by process(%s).", new Object[] { this.fVh });
          GMTrace.o(18692637196288L, 139271);
          return;
        }
        Object localObject = null;
        try
        {
          if (paramc != null) {
            localObject = new b.a()
            {
              public final void k(Bundle paramAnonymous2Bundle)
              {
                GMTrace.i(18696529510400L, 139300);
                if (paramAnonymous2Bundle != null) {
                  paramAnonymous2Bundle.setClassLoader(e.class.getClassLoader());
                }
                e.1.this.fVr.k(paramAnonymous2Bundle);
                GMTrace.o(18696529510400L, 139300);
              }
            };
          }
          locala.a(paramBundle, paramClass.getName(), (com.tencent.mm.ipcinvoker.b.b)localObject);
          GMTrace.o(18692637196288L, 139271);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          w.d("IPC.IPCInvoker", "invokeAsync failed, ipc invoke error : %s", new Object[] { localRemoteException });
          GMTrace.o(18692637196288L, 139271);
        }
      }
    });
    GMTrace.o(18693174067200L, 139275);
    return bool;
  }
  
  public static <T extends g<InputType, ResultType>, InputType extends Parcelable, ResultType extends Parcelable> boolean a(String paramString, final InputType paramInputType, final Class<T> paramClass, final h<ResultType> paramh)
  {
    GMTrace.i(18693442502656L, 139277);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("IPC.IPCInvoker", "invokeAsync failed, process is null or nil.");
      GMTrace.o(18693442502656L, 139277);
      return false;
    }
    boolean bool = l.d(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18712769855488L, 139421);
        if (d.em(this.fVh))
        {
          ((e.a)n.a(e.a.class, e.a.class)).a(e.a(paramInputType, paramClass), new c()
          {
            public final void k(Bundle paramAnonymous2Bundle)
            {
              GMTrace.i(18697066381312L, 139304);
              if (e.2.this.fVu != null)
              {
                if (paramAnonymous2Bundle == null)
                {
                  e.2.this.fVu.al(null);
                  GMTrace.o(18697066381312L, 139304);
                  return;
                }
                paramAnonymous2Bundle.setClassLoader(e.class.getClassLoader());
                e.2.this.fVu.al(paramAnonymous2Bundle.getParcelable("__remote_task_result_data"));
              }
              GMTrace.o(18697066381312L, 139304);
            }
          });
          GMTrace.o(18712769855488L, 139421);
          return;
        }
        com.tencent.mm.ipcinvoker.b.a locala = b.vN().ek(this.fVh);
        if (locala == null)
        {
          w.e("IPC.IPCInvoker", "invokeAsync failed, get bridge is null by process(%s).", new Object[] { this.fVh });
          GMTrace.o(18712769855488L, 139421);
          return;
        }
        b.a local2 = null;
        try
        {
          if (paramh != null) {
            local2 = new b.a()
            {
              public final void k(Bundle paramAnonymous2Bundle)
              {
                GMTrace.i(18701227130880L, 139335);
                if (paramAnonymous2Bundle == null)
                {
                  e.2.this.fVu.al(null);
                  GMTrace.o(18701227130880L, 139335);
                  return;
                }
                paramAnonymous2Bundle.setClassLoader(e.class.getClassLoader());
                e.2.this.fVu.al(paramAnonymous2Bundle.getParcelable("__remote_task_result_data"));
                GMTrace.o(18701227130880L, 139335);
              }
            };
          }
          locala.a(e.a(paramInputType, paramClass), e.a.class.getName(), local2);
          GMTrace.o(18712769855488L, 139421);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          w.d("IPC.IPCInvoker", "invokeAsync failed, ipc invoke error : %s", new Object[] { localRemoteException });
          GMTrace.o(18712769855488L, 139421);
        }
      }
    });
    GMTrace.o(18693442502656L, 139277);
    return bool;
  }
  
  private static class a
    implements a
  {
    private a()
    {
      GMTrace.i(18690355494912L, 139254);
      GMTrace.o(18690355494912L, 139254);
    }
    
    public final void a(Bundle paramBundle, final c paramc)
    {
      GMTrace.i(18690489712640L, 139255);
      Parcelable localParcelable = paramBundle.getParcelable("__remote_task_data");
      paramBundle = paramBundle.getString("__remote_task_class");
      if ((paramBundle == null) || (paramBundle.length() == 0))
      {
        w.e("IPC.IPCInvoker", "proxy AsyncInvoke failed, class is null or nil.");
        GMTrace.o(18690489712640L, 139255);
        return;
      }
      g localg = (g)n.c(paramBundle, g.class);
      if (localg == null)
      {
        w.w("IPC.IPCInvoker", "proxy AsyncInvoke failed, newInstance(%s) return null.", new Object[] { paramBundle });
        GMTrace.o(18690489712640L, 139255);
        return;
      }
      localg.a(localParcelable, new h() {});
      GMTrace.o(18690489712640L, 139255);
    }
  }
  
  private static class b
    implements k
  {
    private b()
    {
      GMTrace.i(18696663728128L, 139301);
      GMTrace.o(18696663728128L, 139301);
    }
    
    public final Bundle l(Bundle paramBundle)
    {
      GMTrace.i(18696797945856L, 139302);
      if (paramBundle == null)
      {
        w.e("IPC.IPCInvoker", "proxy SyncInvoke failed, data is null.");
        GMTrace.o(18696797945856L, 139302);
        return null;
      }
      Parcelable localParcelable = paramBundle.getParcelable("__remote_task_data");
      Object localObject = paramBundle.getString("__remote_task_class");
      if ((localObject == null) || (((String)localObject).length() == 0))
      {
        w.e("IPC.IPCInvoker", "proxy SyncInvoke failed, class is null or nil.");
        GMTrace.o(18696797945856L, 139302);
        return null;
      }
      paramBundle = (i)n.c((String)localObject, i.class);
      if (paramBundle == null)
      {
        w.w("IPC.IPCInvoker", "proxy SyncInvoke failed, newInstance(%s) return null.", new Object[] { localObject });
        GMTrace.o(18696797945856L, 139302);
        return null;
      }
      localObject = new Bundle();
      ((Bundle)localObject).putParcelable("__remote_task_result_data", (Parcelable)paramBundle.am(localParcelable));
      GMTrace.o(18696797945856L, 139302);
      return (Bundle)localObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */