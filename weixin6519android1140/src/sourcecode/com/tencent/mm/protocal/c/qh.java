package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class qh
  extends ayx
{
  public int tPV;
  public String tQN;
  public long tQd;
  public int tWu;
  public String ufz;
  public int ugl;
  public long ugm;
  
  public qh()
  {
    GMTrace.i(4021700001792L, 29964);
    GMTrace.o(4021700001792L, 29964);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4021834219520L, 29965);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tPV);
      paramVarArgs.fk(2, this.tWu);
      paramVarArgs.fk(3, this.ugl);
      if (this.tQN != null) {
        paramVarArgs.e(4, this.tQN);
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(5, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.tQd);
      if (this.ufz != null) {
        paramVarArgs.e(7, this.ufz);
      }
      paramVarArgs.T(8, this.ugm);
      GMTrace.o(4021834219520L, 29965);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tPV) + 0 + b.a.a.a.fh(2, this.tWu) + b.a.a.a.fh(3, this.ugl);
      paramInt = i;
      if (this.tQN != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tQN);
      }
      i = paramInt;
      if (this.uNh != null) {
        i = paramInt + b.a.a.a.fj(5, this.uNh.aYq());
      }
      i += b.a.a.a.S(6, this.tQd);
      paramInt = i;
      if (this.ufz != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.ufz);
      }
      i = b.a.a.a.S(8, this.ugm);
      GMTrace.o(4021834219520L, 29965);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4021834219520L, 29965);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      qh localqh = (qh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4021834219520L, 29965);
        return -1;
      case 1: 
        localqh.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4021834219520L, 29965);
        return 0;
      case 2: 
        localqh.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4021834219520L, 29965);
        return 0;
      case 3: 
        localqh.ugl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4021834219520L, 29965);
        return 0;
      case 4: 
        localqh.tQN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4021834219520L, 29965);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localqh.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4021834219520L, 29965);
        return 0;
      case 6: 
        localqh.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(4021834219520L, 29965);
        return 0;
      case 7: 
        localqh.ufz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4021834219520L, 29965);
        return 0;
      }
      localqh.ugm = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(4021834219520L, 29965);
      return 0;
    }
    GMTrace.o(4021834219520L, 29965);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */