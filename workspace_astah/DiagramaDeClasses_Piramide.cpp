class Piramide {
public:
  double exibirVolume(){
    return (this->base + this->altura) / 3;
  }

private:
  double base;
  double altura;
};
