package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aje
  extends ayx
{
  public String eDJ;
  public String eSd;
  public int scene;
  public String signature;
  public String url;
  public String uxY;
  public String uxZ;
  public LinkedList<String> uym;
  public String uyn;
  
  public aje()
  {
    GMTrace.i(3983045296128L, 29676);
    this.uym = new LinkedList();
    GMTrace.o(3983045296128L, 29676);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3983179513856L, 29677);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      if (this.eSd != null) {
        paramVarArgs.e(3, this.eSd);
      }
      paramVarArgs.d(4, 1, this.uym);
      if (this.eDJ != null) {
        paramVarArgs.e(5, this.eDJ);
      }
      if (this.uxY != null) {
        paramVarArgs.e(6, this.uxY);
      }
      if (this.signature != null) {
        paramVarArgs.e(7, this.signature);
      }
      if (this.uxZ != null) {
        paramVarArgs.e(8, this.uxZ);
      }
      paramVarArgs.fk(9, this.scene);
      if (this.uyn != null) {
        paramVarArgs.e(10, this.uyn);
      }
      GMTrace.o(3983179513856L, 29677);
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
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.url);
      }
      i = paramInt;
      if (this.eSd != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eSd);
      }
      i += b.a.a.a.c(4, 1, this.uym);
      paramInt = i;
      if (this.eDJ != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.eDJ);
      }
      i = paramInt;
      if (this.uxY != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uxY);
      }
      paramInt = i;
      if (this.signature != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.signature);
      }
      i = paramInt;
      if (this.uxZ != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.uxZ);
      }
      i += b.a.a.a.fh(9, this.scene);
      paramInt = i;
      if (this.uyn != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.uyn);
      }
      GMTrace.o(3983179513856L, 29677);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uym.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3983179513856L, 29677);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aje localaje = (aje)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3983179513856L, 29677);
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
          localaje.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3983179513856L, 29677);
        return 0;
      case 2: 
        localaje.url = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3983179513856L, 29677);
        return 0;
      case 3: 
        localaje.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3983179513856L, 29677);
        return 0;
      case 4: 
        localaje.uym.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3983179513856L, 29677);
        return 0;
      case 5: 
        localaje.eDJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3983179513856L, 29677);
        return 0;
      case 6: 
        localaje.uxY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3983179513856L, 29677);
        return 0;
      case 7: 
        localaje.signature = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3983179513856L, 29677);
        return 0;
      case 8: 
        localaje.uxZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3983179513856L, 29677);
        return 0;
      case 9: 
        localaje.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3983179513856L, 29677);
        return 0;
      }
      localaje.uyn = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3983179513856L, 29677);
      return 0;
    }
    GMTrace.o(3983179513856L, 29677);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */