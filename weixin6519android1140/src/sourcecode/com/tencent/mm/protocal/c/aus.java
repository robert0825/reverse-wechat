package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aus
  extends ayx
{
  public String lSX;
  public long uKe;
  public int uKf;
  public String uKg;
  public long uKh;
  public int uhU;
  public long uhV;
  
  public aus()
  {
    GMTrace.i(3635958251520L, 27090);
    GMTrace.o(3635958251520L, 27090);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3636092469248L, 27091);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uhU);
      paramVarArgs.T(3, this.uhV);
      if (this.lSX != null) {
        paramVarArgs.e(4, this.lSX);
      }
      paramVarArgs.T(5, this.uKe);
      paramVarArgs.fk(6, this.uKf);
      if (this.uKg != null) {
        paramVarArgs.e(7, this.uKg);
      }
      paramVarArgs.T(8, this.uKh);
      GMTrace.o(3636092469248L, 27091);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uhU) + b.a.a.a.S(3, this.uhV);
      paramInt = i;
      if (this.lSX != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lSX);
      }
      i = paramInt + b.a.a.a.S(5, this.uKe) + b.a.a.a.fh(6, this.uKf);
      paramInt = i;
      if (this.uKg != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uKg);
      }
      i = b.a.a.a.S(8, this.uKh);
      GMTrace.o(3636092469248L, 27091);
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
      GMTrace.o(3636092469248L, 27091);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aus localaus = (aus)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3636092469248L, 27091);
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
          localaus.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3636092469248L, 27091);
        return 0;
      case 2: 
        localaus.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3636092469248L, 27091);
        return 0;
      case 3: 
        localaus.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3636092469248L, 27091);
        return 0;
      case 4: 
        localaus.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3636092469248L, 27091);
        return 0;
      case 5: 
        localaus.uKe = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3636092469248L, 27091);
        return 0;
      case 6: 
        localaus.uKf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3636092469248L, 27091);
        return 0;
      case 7: 
        localaus.uKg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3636092469248L, 27091);
        return 0;
      }
      localaus.uKh = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3636092469248L, 27091);
      return 0;
    }
    GMTrace.o(3636092469248L, 27091);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\aus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */