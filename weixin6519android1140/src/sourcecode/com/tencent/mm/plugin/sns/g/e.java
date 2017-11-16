package com.tencent.mm.plugin.sns.g;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ber;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.bm.a
{
  public ber prY;
  public String pzf;
  public int pzg;
  public String pzh;
  
  public e()
  {
    GMTrace.i(8866154676224L, 66058);
    GMTrace.o(8866154676224L, 66058);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(8866288893952L, 66059);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.pzf == null) {
        throw new b("Not all required fields were included: clientID");
      }
      if (this.prY == null) {
        throw new b("Not all required fields were included: actionGroup");
      }
      if (this.pzf != null) {
        paramVarArgs.e(1, this.pzf);
      }
      if (this.prY != null)
      {
        paramVarArgs.fm(2, this.prY.aYq());
        this.prY.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.pzg);
      if (this.pzh != null) {
        paramVarArgs.e(4, this.pzh);
      }
      GMTrace.o(8866288893952L, 66059);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.pzf != null) {
        paramInt = b.a.a.b.b.a.f(1, this.pzf) + 0;
      }
      i = paramInt;
      if (this.prY != null) {
        i = paramInt + b.a.a.a.fj(2, this.prY.aYq());
      }
      i += b.a.a.a.fh(3, this.pzg);
      paramInt = i;
      if (this.pzh != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.pzh);
      }
      GMTrace.o(8866288893952L, 66059);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.pzf == null) {
        throw new b("Not all required fields were included: clientID");
      }
      if (this.prY == null) {
        throw new b("Not all required fields were included: actionGroup");
      }
      GMTrace.o(8866288893952L, 66059);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      e locale = (e)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(8866288893952L, 66059);
        return -1;
      case 1: 
        locale.pzf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(8866288893952L, 66059);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ber();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((ber)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locale.prY = ((ber)localObject1);
          paramInt += 1;
        }
        GMTrace.o(8866288893952L, 66059);
        return 0;
      case 3: 
        locale.pzg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(8866288893952L, 66059);
        return 0;
      }
      locale.pzh = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(8866288893952L, 66059);
      return 0;
    }
    GMTrace.o(8866288893952L, 66059);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\g\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */