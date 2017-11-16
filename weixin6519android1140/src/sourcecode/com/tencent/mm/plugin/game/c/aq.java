package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.es;
import java.util.LinkedList;

public final class aq
  extends azh
{
  public bo lRB;
  public LinkedList<b> lRC;
  public boolean lRD;
  public int lRE;
  
  public aq()
  {
    GMTrace.i(12645860114432L, 94219);
    this.lRC = new LinkedList();
    GMTrace.o(12645860114432L, 94219);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12645994332160L, 94220);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.lRB != null)
      {
        paramVarArgs.fm(2, this.lRB.aYq());
        this.lRB.a(paramVarArgs);
      }
      paramVarArgs.d(3, 8, this.lRC);
      paramVarArgs.ah(4, this.lRD);
      paramVarArgs.fk(5, this.lRE);
      GMTrace.o(12645994332160L, 94220);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.lRB != null) {
        i = paramInt + b.a.a.a.fj(2, this.lRB.aYq());
      }
      paramInt = b.a.a.a.c(3, 8, this.lRC);
      int j = b.a.a.b.b.a.cK(4);
      int k = b.a.a.a.fh(5, this.lRE);
      GMTrace.o(12645994332160L, 94220);
      return i + paramInt + (j + 1) + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lRC.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(12645994332160L, 94220);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aq localaq = (aq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12645994332160L, 94220);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaq.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12645994332160L, 94220);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaq.lRB = ((bo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12645994332160L, 94220);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new b();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((b)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaq.lRC.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12645994332160L, 94220);
        return 0;
      case 4: 
        localaq.lRD = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(12645994332160L, 94220);
        return 0;
      }
      localaq.lRE = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(12645994332160L, 94220);
      return 0;
    }
    GMTrace.o(12645994332160L, 94220);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */