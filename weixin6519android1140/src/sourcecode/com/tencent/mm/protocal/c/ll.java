package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ll
  extends ayx
{
  public String gPS;
  public String lSX;
  public String lSY;
  public int tRF;
  public String tYF;
  public long ucb;
  public String ucc;
  public String ucd;
  
  public ll()
  {
    GMTrace.i(3960496717824L, 29508);
    GMTrace.o(3960496717824L, 29508);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3960630935552L, 29509);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lSY != null) {
        paramVarArgs.e(2, this.lSY);
      }
      if (this.lSX != null) {
        paramVarArgs.e(3, this.lSX);
      }
      paramVarArgs.T(4, this.ucb);
      if (this.tYF != null) {
        paramVarArgs.e(5, this.tYF);
      }
      if (this.ucc != null) {
        paramVarArgs.e(6, this.ucc);
      }
      paramVarArgs.fk(7, this.tRF);
      if (this.ucd != null) {
        paramVarArgs.e(8, this.ucd);
      }
      if (this.gPS != null) {
        paramVarArgs.e(9, this.gPS);
      }
      GMTrace.o(3960630935552L, 29509);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.lSY != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lSY);
      }
      i = paramInt;
      if (this.lSX != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lSX);
      }
      i += b.a.a.a.S(4, this.ucb);
      paramInt = i;
      if (this.tYF != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tYF);
      }
      i = paramInt;
      if (this.ucc != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.ucc);
      }
      i += b.a.a.a.fh(7, this.tRF);
      paramInt = i;
      if (this.ucd != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ucd);
      }
      i = paramInt;
      if (this.gPS != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.gPS);
      }
      GMTrace.o(3960630935552L, 29509);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3960630935552L, 29509);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ll localll = (ll)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3960630935552L, 29509);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localll.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3960630935552L, 29509);
        return 0;
      case 2: 
        localll.lSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3960630935552L, 29509);
        return 0;
      case 3: 
        localll.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3960630935552L, 29509);
        return 0;
      case 4: 
        localll.ucb = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3960630935552L, 29509);
        return 0;
      case 5: 
        localll.tYF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3960630935552L, 29509);
        return 0;
      case 6: 
        localll.ucc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3960630935552L, 29509);
        return 0;
      case 7: 
        localll.tRF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3960630935552L, 29509);
        return 0;
      case 8: 
        localll.ucd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3960630935552L, 29509);
        return 0;
      }
      localll.gPS = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3960630935552L, 29509);
      return 0;
    }
    GMTrace.o(3960630935552L, 29509);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */