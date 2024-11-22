# Groupe 9 - ESME

## **Auteurs**
- **Marwa Mostaghfir**
- **Kim Davy NDAYONGEJE**
- **Gaby Paultre**
- **Lou Allard**

---

## **Description**

Ce dépôt Git contient les layers et les recettes nécessaires pour déployer une application `gpio-toggle` sur un système Linux basé sur Yocto.

### **Contenu du dépôt**
1. **Layer `meta-esme-custom`**
   - Ce layer contient la recette `esme-gpio` permettant :
     - La compilation du programme `gpio-toggle` pour gérer une LED connectée à un GPIO (#17) en utilisant la bibliothèque **libgpiod**.
     - L'installation d'un script nommé `esme-led` pour activer le programme au démarrage.

2. **Layer `meta-esme-images`**
   - Ce layer contient les configurations et personnalisations pour créer une image Yocto fonctionnelle, adaptée à Raspberry Pi.
   - Il inclut les ajustements nécessaires au démarrage pour exécuter `esme-led`.

---

## **Contexte du projet**

Ce projet vise à fournir une image Yocto capable de contrôler une LED via GPIO sur un Raspberry Pi. Il illustre l'intégration entre Yocto et un système embarqué, avec un déploiement simplifié via Git.

---

## **Année**
2024
